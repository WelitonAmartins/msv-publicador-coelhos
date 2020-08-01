package br.com.unilito.rmq.msvpublicadorcoelho.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.unilito.rmq.msvpublicadorcoelho.service.PublicadorService;

@RestController("/publicador")
public class PublicadorResource {
	
	@Autowired
	private PublicadorService publicadorService;
	
	public ResponseEntity<String> publicar(){
		
		publicadorService.publicar();
		
		return ResponseEntity.ok("Sucesso");
	}

}
