package com.christophe.rhapsode.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.christophe.rhapsode.model.Language;

public interface LanguageDao extends MongoRepository<Language, String> {

	Language findOneByName(String name);

}
