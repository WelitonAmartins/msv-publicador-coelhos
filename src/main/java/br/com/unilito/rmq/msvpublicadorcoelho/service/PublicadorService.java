package br.com.unilito.rmq.msvpublicadorcoelho.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Log
@Service
public class PublicadorService {

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Queue fila;

	public void publicar() {
		log.info("Enviando o Coelho");
		template.convertAndSend(fila.getName(), "Publicando coelhos");
		log.info("Coelho enviado");
	}

}
