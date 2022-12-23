package com.rabbitmq.rabbitmqdemo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqdemoApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 1
		//rabbitTemplate.convertAndSend("Hello from our rabbitmqdemo project!");

		// 2
		//rabbitTemplate.convertAndSend("SeydaTestExchange", "testRoutingKey", "Hello again from our rabbitmqdemo project!");

		// 3

		//SimpleMessage simpleMessage = new SimpleMessage();
		//simpleMessage.setName("simpleName");
		//simpleMessage.setDescription("simpleDescription");

		//rabbitTemplate.convertAndSend("SeydaTestExchange", "testRoutingKey", simpleMessage);

		// 4

		SimpleMessage myMessage = new SimpleMessage();
		myMessage.setName("myName");
		myMessage.setDescription("myDescription");

		rabbitTemplate.convertAndSend("MY_EXCHANGE", "myRoutingKey", myMessage.toString());
	}
}
