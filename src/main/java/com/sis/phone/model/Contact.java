package com.sis.phone.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Contact {
	@Id
	private Integer contactId;
	@Column(length = 20)
	private String contactName;
	@Column(length = 20)
	private String contactNumber;
	@Column(length = 20)
	private String contactEmail;
	private Character activeSwitch;
	private LocalDate createdDate;
	private LocalDate updateDate;
}
