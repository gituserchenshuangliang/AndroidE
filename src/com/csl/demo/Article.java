package com.csl.demo;
/**
 * entity
 * @author Cherry
 * @date  2019年6月11日
 */
public class Article {
	private String id;
	private String title;
	private String contents;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Article(String title, String contents) {
		super();
		this.title = title;
		this.contents = contents;
	}
}
