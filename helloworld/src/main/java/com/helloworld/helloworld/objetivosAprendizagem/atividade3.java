package com.helloworld.helloworld.objetivosAprendizagem;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class atividade3 {
	ArrayList<String> objetivos = new ArrayList<String>();
	
	@GetMapping
	public String competenciasBSM() {
		return "Soft Skill,<br> "
				+ "Melhorar Currículo, <br>"
				+ "Melhorar Gestão do Tempo, <br>"
				+ "Terminar tarefas pendentes <br>";
	}
	
}