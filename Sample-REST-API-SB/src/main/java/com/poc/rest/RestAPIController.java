package com.poc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.poc.customstarter.service.MessageService;

@RestController
public class RestAPIController {
	
	@Autowired
	private MessageService customMessageService;
	
	@GetMapping(value="/custom-message/{message}")
	public ResponseEntity<String> customMessage(@PathVariable String message) {
		return new ResponseEntity<String>(customMessageService.decorateMessage(message),HttpStatus.OK);
		//return new ResponseEntity<String>("hello-world",HttpStatus.OK);
	}

}
