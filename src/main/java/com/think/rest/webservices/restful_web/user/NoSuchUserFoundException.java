package com.think.rest.webservices.restful_web.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class NoSuchUserFoundException extends RuntimeException{
    /// get ype=Internal Server Error, status=500).
    /// id: 8
    /// com.think.rest.webservices.restful_web.user.NoSuchUserFoundException: id: 8
    ///
    /// use responseStatus to get not found
    public NoSuchUserFoundException(String message) {
        super(message);
    }
}
