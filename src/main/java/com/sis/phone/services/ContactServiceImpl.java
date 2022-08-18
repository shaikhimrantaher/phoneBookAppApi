package com.sis.phone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sis.phone.model.Contact;
import com.sis.phone.repository.ContactRepo;

public class ContactServiceImpl implements ContactServiceI{

	@Autowired
	private ContactRepo contactRepo;
	
	@Override
	public boolean saveContact(Contact contact) {
		
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {

		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		
		return false;
	}

}
