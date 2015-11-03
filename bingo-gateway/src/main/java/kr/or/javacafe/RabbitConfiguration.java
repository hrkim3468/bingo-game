package kr.or.javacafe;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class RabbitConfiguration {

	protected final String myQueueName = "hello.world.queue";
	
	@Bean
	public ConnectionFactory connectionFactory() {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("guest");
		return connectionFactory;
	}
	
	@Bean
	public AmqpAdmin amqpAdmin() {
		return new RabbitAdmin(connectionFactory());
	}
	
	@Bean
	public RabbitTemplate rabbitTemplate() {
		RabbitTemplate template =  new RabbitTemplate(connectionFactory());
		template.setRoutingKey(this.myQueueName);
		template.setQueue(this.myQueueName);
		return template;
	}
	
//	@Bean
//	public Queue myQueue() {
//		return new Queue("myqueue");
//	}
	
}
