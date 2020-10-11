package com.poc.rest.service;

import org.springframework.stereotype.Service;

import com.poc.customstarter.service.MessageService;
@Service
public class CustomMessageService implements MessageService{

	@Override
	public String decorateMessage(String message) {
		return "Custom Message:"+message;
	}

}
