package com.christophe.rhapsode.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Article {

	private static int count = 0;

	@Id
	@GeneratedValue
	private int id;

	private String title;

	private String description;

	private String url;

	@OneToMany
	private List<Photo> photos;
	
	@ManyToMany 
	private List<Language> languages;

	public Article() {
		count++;
		photos = new ArrayList<Photo>();
		languages = new ArrayList<Language>();
	}

	static public int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void addPhotos(Photo photo) {
		this.photos.add(photo);
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

	public void addLanguages(Language language) {
		this.languages.add(language);
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", description=" + description + ", url=" + url + ", photo="
				+ photos + ", language=" + languages + "]";
	}


}
