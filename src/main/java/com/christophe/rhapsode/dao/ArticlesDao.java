package com.christophe.rhapsode.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.christophe.rhapsode.model.Article;

public interface ArticlesDao extends MongoRepository<Article, String> {

}
