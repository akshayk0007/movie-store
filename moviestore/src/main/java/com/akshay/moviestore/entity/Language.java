package com.akshay.moviestore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="language_table")
@Data
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "language_code")
	private String languageCode;
	
	@Column(name = "language_name")
	private String languageName;
}
