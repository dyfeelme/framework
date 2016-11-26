package com.zs.biz.mq.consumer;

public class QueueOneListener implements  MessageListener{
	@Override
	public void onMessage(Message message) {
		System.out.println(" data :" + message.getBody());
	}
}
