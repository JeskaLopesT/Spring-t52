package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica que a classe abaixo é uma classe controladora
@RestController
// serve para a contrução dos endpoints da api
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String hello() {
		return "Alô mundão, se tudo deu certo e se eu não escrevi nada errado";
	}
}
