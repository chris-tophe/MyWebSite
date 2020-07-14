package com.christophe.rhapsode.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private static int count = 0;

	@Id
	private String title;

	private String description;

	private String url;

	private List<Photo> photos;

	private List<Language> languages;

	public Article() {
		count++;
		photos = new ArrayList<Photo>();
		languages = new ArrayList<Language>();
	}

	static public int getCount() {
		return count;
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
		return "Article [ title=" + title + ", description=" + description + ", url=" + url + ", photo="
				+ photos + ", language=" + languages + "]";
	}


}
