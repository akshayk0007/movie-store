package com.akshay.moviestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.akshay.moviestore.entity.Language;
/**
 * 
 * @author Akshay
 * Below line is to override the name and path
 */
//@RepositoryRestResource(collectionResourceRel = "language", path="language")
@CrossOrigin("http://localhost:4200")
public interface LanguageRepository extends JpaRepository<Language, Long>{

}
