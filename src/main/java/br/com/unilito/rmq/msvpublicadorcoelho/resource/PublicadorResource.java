package br.com.unilito.rmq.msvpublicadorcoelho.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unilito.rmq.msvpublicadorcoelho.service.PublicadorService;

@RestController
@RequestMapping("/publicador")
public class PublicadorResource {

	@Autowired
	private PublicadorService publicadorService;

	@GetMapping
	public ResponseEntity<String> publicar() {

		publicadorService.publicar();

		return ResponseEntity.ok("Sucesso");
	}

}
