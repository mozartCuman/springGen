package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldAndSpring {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return " Orientação ao detalhe\n"
				+ "Trabalho em equipe\n"
				+ "Persistência\n"
				+ "Comunicação\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao futuro";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return " Estudar POO\n"
				+ "Compreender Spring\n"
				+ "Treinar Collections\n"
				+ "Começar a estudar Streams\n";
	}
	
}
