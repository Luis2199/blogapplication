package com.itp.blogapp.model;

public class BlogPost {

	private int id;
	private String title;
	private String introduction;
	private String paragraph1;
	private String paragraph2;
	private String paragraph3;
	private String conclusion;
	private String username;
	private String date;

	public BlogPost() {
		
    }

	public BlogPost(int id, String title, String introduction, String paragraph1, String paragraph2, String paragraph3, String conclusion, String username, String date) {
		this.id = id;
		this.title = title;
		this.introduction = introduction;
		this.paragraph1 = paragraph1;
		this.paragraph2 = paragraph2;
		this.paragraph3 = paragraph3;
		this.conclusion = conclusion;
		this.username = username;
		this.date = date;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getParagraph1() {
		return this.paragraph1;
	}

	public void setParagraph1(String paragraph1) {
		this.paragraph1 = paragraph1;
	}

	public String getParagraph2() {
		return this.paragraph2;
	}

	public void setParagraph2(String paragraph2) {
		this.paragraph2 = paragraph2;
	}

	public String getParagraph3() {
		return this.paragraph3;
	}

	public void setParagraph3(String paragraph3) {
		this.paragraph3 = paragraph3;
	}

	public String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
