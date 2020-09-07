package com.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// custom exception class
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RecordNotFoundException extends RuntimeException
{
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String message) {
        super(message);
    }
}
