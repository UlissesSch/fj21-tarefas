package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	
	@RequestMapping("/olaMundoSpring")
	public String ola() {
		System.out.println("executando hello world");
		return "ok";
	}
}
