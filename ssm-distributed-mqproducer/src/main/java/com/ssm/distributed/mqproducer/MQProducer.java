package com.ssm.distributed.mqproducer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ssm.distributed.mqproducer.model.MailParam;

/**
 * MQ消息生产者 .
 */
@Service("mqProducer")
public class MQProducer {

	@Autowired
	private JmsTemplate activeMqJmsTemplate;

	/**
	 * 发送消息.
	 * 
	 * @param mail
	 */
	public void sendMessage(final MailParam mail) {
		activeMqJmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(JSONObject.toJSONString(mail));
			}
		});

	}

}
