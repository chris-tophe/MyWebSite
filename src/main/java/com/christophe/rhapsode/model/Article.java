package com.christophe.rhapsode.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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

	@ElementCollection
	@OneToMany
	private List<Photo> photo;
	
	@ElementCollection
	@OneToMany
	private List<Language> language;

	public Article() {
		count++;
		photo = new ArrayList<Photo>();
		language = new ArrayList<Language>();
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

	public List<Photo> getPhoto() {
		return photo;
	}

	public void addPhoto(Photo photo) {
		this.photo.add(photo);
	}
	
	public List<Language> getLanguage() {
		return language;
	}

	public void addLanguage(Language language) {
		this.language.add(language);
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", description=" + description + ", url=" + url + ", photo="
				+ photo + ", language=" + language + "]";
	}


}
