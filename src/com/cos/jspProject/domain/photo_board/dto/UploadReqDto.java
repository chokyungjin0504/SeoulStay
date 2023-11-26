package com.cos.jspProject.domain.photo_board.dto;

import lombok.Data;

@Data
public class UploadReqDto {
	private int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private String photoImage;
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
	private String content;
}
