package com.christophe.rhapsode.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Language {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    private String name;
    
    private String image;
    
    @ManyToMany(mappedBy = "languages")
    private List<Article> articles;
    
   
    public Language() {
    	articles = new ArrayList<Article>();
    }
    
    public Language(String name) {
    	articles = new ArrayList<Article>();
		this.name = name;
	}
    
	public int getId() {
		return id;
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
