package com.sbs.example.textboard;

public class Article {
	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public int id;
	public String title;
	public String body;
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", body=" + body + "]";
	}
}
