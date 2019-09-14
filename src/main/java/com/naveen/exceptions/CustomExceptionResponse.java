package com.naveen.exceptions;

import java.util.Date;

public class CustomExceptionResponse {
	
	private String message;
	private String details;
	private Date date;
	public CustomExceptionResponse(String message, String details, Date date) {
		super();
		this.message = message;
		this.details = details;
		this.date = date;
	}
	public CustomExceptionResponse() {
		super();
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "CustomExceptionResponse [message=" + message + ", details=" + details + ", date=" + date + "]";
	}

}
