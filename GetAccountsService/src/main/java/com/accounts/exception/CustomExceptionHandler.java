package com.accounts.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;


// custom exception handler class
@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler 
{
	private String INCORRECT_REQUEST = "INCORRECT_REQUEST";
	private String BAD_REQUEST = "BAD_REQUEST";
	
	@ExceptionHandler(RecordNotFoundException.class)
	public final ResponseEntity<ErrorResponse> handleCustomerNotFoundException
						(RecordNotFoundException ex, WebRequest request) 
	{
		List<String> details = new ArrayList<>();
		details.add(ex.getLocalizedMessage());
		ErrorResponse error = new ErrorResponse(INCORRECT_REQUEST, details);
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}		
	
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public final ResponseEntity<ErrorResponse> handleCustomerNotFoundException
						(MethodArgumentTypeMismatchException ex, WebRequest request) 
	{
		List<String> details = new ArrayList<>();
		details.add("Customer Id should be an Integer value");
		ErrorResponse error = new ErrorResponse(BAD_REQUEST, details);
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public final ResponseEntity<ErrorResponse> handleConstraintViolation(
											ConstraintViolationException ex,
											WebRequest request)
	{
		List<String> details = ex.getConstraintViolations()
									.parallelStream()
									.map(e -> e.getMessage())
									.collect(Collectors.toList());

		ErrorResponse error = new ErrorResponse(BAD_REQUEST, details);
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
}