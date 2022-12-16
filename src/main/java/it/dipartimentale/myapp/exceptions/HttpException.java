package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class HttpException extends RuntimeException {

    protected final HttpStatus status;

    public HttpException(HttpStatus status) {
        super();
        this.status = status;
    }

    public HttpException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

}
