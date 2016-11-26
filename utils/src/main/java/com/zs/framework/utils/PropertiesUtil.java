package com.zs.framework.utils;

import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Maps;
/**
 * Properties文件读取工具类
 * @author Feelme
 * 依赖 slf4j,guava
 */
public class PropertiesUtil {
	
	/**
	 * 日志
	 */
	private static final Logger log = LoggerFactory.getLogger(PropertiesUtil.class);
	
	private static final Map<String,ResourceBundle> resMap = Maps.newHashMap();
	/**
	 * 加载资源文件
	 * @param bundleName
	 * @return
	 */
	static ResourceBundle load(String bundleName){
		ResourceBundle res = resMap.get(bundleName);
		
		if(res == null){
			try {
				res = ResourceBundle.getBundle(bundleName, Locale.getDefault());
				resMap.put(bundleName,res);
				
				log.info("Success load properties:{}",new Object[]{bundleName});
			} catch (MissingResourceException e) {
				log.warn("Cannot load proerties:{}",new Object[]{bundleName},e);
			}catch (Exception e) {
				log.error("Unkown exception",e);
			}
		}
		
		return res;
	}
	
	/**
	 * 获取属性值
	 * @param bundleName 资源名
	 * @param key 属性名
	 * @return  属性值
	 */
	public static String getProperty(String bundleName,String key){
		ResourceBundle res = load(bundleName);
		if(res!=null){
			return res.getString(key);
		}
		return null;
	}
	
	/**
	 * 获取属性值，如果没有，返回默认
	 * @param bundleName 资源名
	 * @param key 属性名
	 * @param defaultValue 为空，默认值
	 * @return
	 */
	public static String getProperty(String bundleName,String key,String defaultValue){
		ResourceBundle res = load(bundleName);
		
		if(res != null){
			return res.getString(key);
		}
		return defaultValue;
	}

}
