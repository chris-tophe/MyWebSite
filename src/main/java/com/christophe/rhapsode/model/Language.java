package com.christophe.rhapsode.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Language {
	

	@Id
    private String name;
    
    private String image;

    private List<Article> articles;

    public Language() {
    	articles = new ArrayList<Article>();
    }
    
    public Language(String name) {
    	articles = new ArrayList<Article>();
		this.name = name;
	}
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public List<Article> getArticles() {
		return articles;
	}
	
	public void addArticles(Article article) {
		articles.add(article);
	}
	

	@Override
	public String toString() {
		return "Language [name=" + name + ", image=" + image + "]";
	}
	
}
