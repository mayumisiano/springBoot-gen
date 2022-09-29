package com.helloworld.helloworld.bsms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class atividade2 {
	@GetMapping
	public String competenciasBSM() {
		return "Orientação ao Futuro,<br> "
				+ "Responsabilidade Pessoal,<br>"
				+ "Mentalidade de Crescimento, <br> "
				+ "Persistência, <br> "
				+ "Trabalho em Equipe, <br>"
				+ "Atenção aos Detalhes, <br>"
				+ "Proatividade,<br>"
				+ "Comunicação";

}
	
}
