package com.ssm.distributed.mqconsumer.listener;

import javax.jms.Message;
import javax.jms.Session;

import org.apache.activemq.command.ActiveMQTextMessage;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * 队列监听器 .
 */
@Component
public class ConsumerSessionAwareMessageListener implements SessionAwareMessageListener<Message> {

	private static final Log log = LogFactory.getLog(ConsumerSessionAwareMessageListener.class);

	public synchronized void onMessage(Message message, Session session) {
		try {
			ActiveMQTextMessage msg = (ActiveMQTextMessage) message;
			final String ms = msg.getText();
			log.info("==>receive message:" + ms);
		} catch (Exception e) {
			log.error("==>", e);
		}
	}
}
