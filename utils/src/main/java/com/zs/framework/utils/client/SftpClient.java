package com.zs.framework.utils.client;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;

public class SftpClient {
	
	/**
	 * logger
	 */
	private static final Logger log = LoggerFactory.getLogger(SftpClient.class);
	
	private static Map<String,Object> config = Maps.newHashMap();
	
	private static final String DEFAULT_BUNDLE_NAME = "sftp";

	private static final String SFTP_PROP_USERNAME = null;

	private static final String SFTP_PROP_HOST = null;

	private static final String SFTP_PROP_PORT = null;

	private static final String SFTP_PROP_TIMEOUT = null;

	private static final int DEFAULT_TIMEOUT = 0;
	
	private String bundleName;
	
	public void setBundleName(String bundleName){
		this.bundleName = bundleName;
	}

	
	private Session session;
	
	private ChannelSftp channel;
	
	private ResourceBundle res;
	
		
	
	public SftpClient login() throws JSchException{
		
		if(bundleName == null || "".equals(bundleName)){
			res = ResourceBundle.getBundle(DEFAULT_BUNDLE_NAME);
		}else{
			res = ResourceBundle.getBundle(bundleName);
		}
		
		JSch jsch = new JSch();
		String username = res.getString(SFTP_PROP_USERNAME);
		String host = res.getString(SFTP_PROP_HOST);
		int port = Integer.parseInt(res.getString(SFTP_PROP_PORT));
		session = jsch.getSession(username, host, port);
		
		String password = res.getString("SFTP_PROP_PASSWORD");
		if(password == null || "".equals(password)){
			session.setPassword(password);
		}
		
		Properties config = new Properties();
		config.setProperty("StrictHostKeyChecking", "no");
		
		session.setConfig(config);
		int timeout = DEFAULT_TIMEOUT;
		try {
			timeout = Integer.parseInt(res.getString(SFTP_PROP_TIMEOUT));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setTimeout(timeout );
		
		session.connect();
		
		channel = (ChannelSftp) session.openChannel("sftp");
		
		return this;
	}
	
	public SftpClient upload(String localFile,String remoteDir) throws SftpException{
		File file = new File(localFile);
		if(file.exists()){
			if(file.isFile()){
				String src = localFile;
				String dst = remoteDir;
				//传输至远程目录
				channel.put(src, dst, ChannelSftp.OVERWRITE);
			}else if(file.isDirectory()){
				//递归传输
				for(File f :file.listFiles()){
					String newLocalFile = localFile+File.pathSeparator+f.getName();
					String newRemoteDir = remoteDir+"/"+file.getName();
					upload(newLocalFile,newRemoteDir);
				}
			}
		}
		return this;
	}
	
	public SftpClient download(String remoteFile,String localDir){
		return this;
	}
	
	public void logout(){
		
		channel.quit();
		session.disconnect();
		
	}
	
	
	private class SftpConstant{
		public static final String SFTP_REQ_HOST = "host";
	    public static final String SFTP_REQ_PORT = "port";
	    public static final String SFTP_REQ_USERNAME = "username";
	    public static final String SFTP_REQ_PASSWORD = "password";
	    public static final int SFTP_DEFAULT_PORT = 22;
	    public static final String SFTP_REQ_LOC = "location";
	}
	
	class FileProgressMonitor extends TimerTask implements SftpProgressMonitor {
		
		private long progressInterval = 5 * 1000; // 默认间隔时间为5秒
	    
	    private boolean isEnd = false; // 记录传输是否结束
	    
	    private long transfered; // 记录已传输的数据总大小
	    
	    private long fileSize; // 记录文件总大小
	    
	    private Timer timer; // 定时器对象
	    
	    private boolean isScheduled = false; // 记录是否已启动timer记时器
	    
	    public FileProgressMonitor(long fileSize) {
	        this.fileSize = fileSize;
	    }
	    
	    @Override
	    public void run() {
	        if (!isEnd()) { // 判断传输是否已结束
	            System.out.println("Transfering is in progress.");
	            long transfered = getTransfered();
	            if (transfered != fileSize) { // 判断当前已传输数据大小是否等于文件总大小
	                System.out.println("Current transfered: " + transfered + " bytes");
	                sendProgressMessage(transfered);
	            } else {
	                System.out.println("File transfering is done.");
	                setEnd(true); // 如果当前已传输数据大小等于文件总大小，说明已完成，设置end
	            }
	        } else {
	            System.out.println("Transfering done. Cancel timer.");
	            stop(); // 如果传输结束，停止timer记时器
	            return;
	        }
	    }
	    
	    public void stop() {
	        System.out.println("Try to stop progress monitor.");
	        if (timer != null) {
	            timer.cancel();
	            timer.purge();
	            timer = null;
	            isScheduled = false;
	        }
	        System.out.println("Progress monitor stoped.");
	    }
	    
	    public void start() {
	        System.out.println("Try to start progress monitor.");
	        if (timer == null) {
	            timer = new Timer();
	        }
	        timer.schedule(this, 1000, progressInterval);
	        isScheduled = true;
	        System.out.println("Progress monitor started.");
	    }
	    
	    /**
	     * 打印progress信息
	     * @param transfered
	     */
	    private void sendProgressMessage(long transfered) {
	        if (fileSize != 0) {
	            double d = ((double)transfered * 100)/(double)fileSize;
	            DecimalFormat df = new DecimalFormat( "#.##"); 
	            System.out.println("Sending progress message: " + df.format(d) + "%");
	        } else {
	            System.out.println("Sending progress message: " + transfered);
	        }
	    }

	    /**
	     * 实现了SftpProgressMonitor接口的count方法
	     */
	    public boolean count(long count) {
	        if (isEnd()) return false;
	        if (!isScheduled) {
	            start();
	        }
	        add(count);
	        return true;
	    }

	    /**
	     * 实现了SftpProgressMonitor接口的end方法
	     */
	    public void end() {
	        setEnd(true);
	        System.out.println("transfering end.");
	    }
	    
	    private synchronized void add(long count) {
	        transfered = transfered + count;
	    }
	    
	    private synchronized long getTransfered() {
	        return transfered;
	    }
	    
	    public synchronized void setTransfered(long transfered) {
	        this.transfered = transfered;
	    }
	    
	    private synchronized void setEnd(boolean isEnd) {
	        this.isEnd = isEnd;
	    }
	    
	    private synchronized boolean isEnd() {
	        return isEnd;
	    }

	    public void init(int op, String src, String dest, long max) {
	        // Not used for putting InputStream
	    }
		
	}
	

}
