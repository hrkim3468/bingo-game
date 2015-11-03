package kr.or.javacafe.common.manager;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueueManager {

	private static Logger logger = LoggerFactory.getLogger(QueueManager.class);
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostConstruct
	public void init() {
		
	}
	
	
	public void send(String msg) {
		rabbitTemplate.convertAndSend(msg);
		logger.debug("메시지발송 : " + msg);
	}
	
}
