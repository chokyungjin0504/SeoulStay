package com.cos.jspProject.domain.photo_board.dto;

import lombok.Data;

@Data
public class ListRespDto {
	private int id;
	private int userId;
	private String userNickname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getPhotoImage() {
		return photoImage;
	}
	public void setPhotoImage(String photoImage) {
		this.photoImage = photoImage;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	private String photoImage;
	private String content;
	private int readCount;
}
