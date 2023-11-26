package com.cos.jspProject.domain.photo_board.dto;

import lombok.Data;

@Data
public class CommonRespDto<T> {
	private int statusCode; // 1, -1
	private T data;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}