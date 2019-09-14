package com.naveen.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(PlayerNotFoundException.class)
	public final ResponseEntity<CustomExceptionResponse> handleAllExceptions(PlayerNotFoundException ex, WebRequest request) throws Exception {
	CustomExceptionResponse response =	new CustomExceptionResponse(ex.getMsg(), request.getDescription(false), new Date());
	return new ResponseEntity<CustomExceptionResponse>(response, HttpStatus.NOT_FOUND);
	}
	
	
}
