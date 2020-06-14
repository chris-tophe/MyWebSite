package com.christophe.rhapsode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Photo {

	@Id
	@GeneratedValue
	private int id;
	
	private String url;
	
	private String legend;

	public Photo() {

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLegend() {
		return legend;
	}

	public void setLegend(String legend) {
		this.legend = legend;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + ", legend=" + legend + "]";
	}

}
