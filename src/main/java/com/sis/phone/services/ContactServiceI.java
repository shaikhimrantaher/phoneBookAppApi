package com.sis.phone.services;

import java.util.List;

import com.sis.phone.model.Contact;

public interface ContactServiceI {
	
	public boolean saveContact(Contact contact);

	public List<Contact> getAllContact();

	public Contact getContactById(Integer contactId);

	boolean deleteContactById(Integer contactId);

}
