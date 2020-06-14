package com.christophe.rhapsode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christophe.rhapsode.model.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{
	
	Language findByName(String name);

}
