package com.example.demo.controlador.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba") 
public class Prueba {

	@GetMapping
	public String prueba() {
		return "HOLA";
	}
}
