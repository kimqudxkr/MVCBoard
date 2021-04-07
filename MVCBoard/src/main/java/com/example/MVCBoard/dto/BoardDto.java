package com.example.MVCBoard.dto;

import java.sql.Timestamp;

public class BoardDto {
	int bId;
	String bWriter;
	String bTitle;
	Timestamp bDate;
	int bView;
	String bContent;
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbTitle() {
		return bTitle;
	}
	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getbView() {
		return bView;
	}
	public void setbView(int bView) {
		this.bView = bView;
	}
	public String getbContent() {
		return bContent;
	}
	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	
	public BoardDto() {
		
	}
	
	public BoardDto(int bId, String bWriter, String bTitle, Timestamp bDate, int bView, String bContent) {
		this.bId = bId;
		this.bWriter = bWriter;
		this.bTitle = bTitle;
		this.bDate = bDate;
		this.bView = bView;
		this.bContent = bContent;
	}
}
