package com.akshay.moviestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.akshay.moviestore.entity.Language;
/**
 * 
 * @author Akshay
 * Below line is to override the link name and path
 */
//@RepositoryRestResource(collectionResourceRel = "language", path="language")
public interface LanguageRepository extends JpaRepository<Language, Long>{

}
