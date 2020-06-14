package com.christophe.rhapsode.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	

	@Id
    private String name;
    
    private String image;
    
    public Language() {
    	
    }
    
    public Language(String name) {
		super();
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

	@Override
	public String toString() {
		return "Language [name=" + name + ", image=" + image + "]";
	}
	
}
