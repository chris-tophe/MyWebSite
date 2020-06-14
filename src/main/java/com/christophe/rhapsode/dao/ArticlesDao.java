package com.christophe.rhapsode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christophe.rhapsode.model.Article;

public interface ArticlesDao extends JpaRepository<Article, Integer> {

}
