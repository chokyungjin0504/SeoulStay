package com.cos.jspProject.domain.reply.dto;


import lombok.Data;

@Data
public class SaveReqDto {
	private int userId;
	private int boardId;
	private String content;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}