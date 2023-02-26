package com.example.demo.controlador.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v0/ping")
public class PingREST {

	public ResponseEntity<String>ping()
	{
		return ResponseEntity.ok("ping");
	}
}
