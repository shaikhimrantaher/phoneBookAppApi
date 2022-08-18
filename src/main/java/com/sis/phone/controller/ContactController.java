package com.sis.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.sis.phone.services.ContactServiceImpl;

public class ContactController {
	@Autowired
	private ContactServiceImpl contactServiceImpl;
}
