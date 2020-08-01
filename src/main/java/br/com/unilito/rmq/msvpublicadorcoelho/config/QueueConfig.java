package br.com.unilito.rmq.msvpublicadorcoelho.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueueConfig {

	@Bean
	public Queue fila() {
		return new Queue("coelhinhos");
	}

}
