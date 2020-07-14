package com.christophe.rhapsode.model;

import org.springframework.data.annotation.Id;

public class Photo {

	@Id
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

	@Override
	public String toString() {
		return "Photo [url=" + url + ", legend=" + legend + "]";
	}

}
