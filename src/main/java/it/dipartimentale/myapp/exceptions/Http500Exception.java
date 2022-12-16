package it.dipartimentale.myapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class Http500Exception extends RuntimeException {

    public Http500Exception(String message) {

        super(message);
    }
}
