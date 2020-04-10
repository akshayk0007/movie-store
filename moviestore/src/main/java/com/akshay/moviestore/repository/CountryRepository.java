package com.akshay.moviestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akshay.moviestore.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
