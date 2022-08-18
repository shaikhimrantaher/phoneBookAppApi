package com.sis.phone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sis.phone.model.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
