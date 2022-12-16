package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@Setter
public class BadRequestException extends HttpException {

    public BadRequestException() {

        super(HttpStatus.BAD_REQUEST);
    }

    public BadRequestException(String message) {

        super(HttpStatus.BAD_REQUEST, message);
    }

    static public BadRequestException raise(String message, Object... args) throws BadRequestException {
        BadRequestException e = new BadRequestException(String.format(message, args));
        log.debug(e.getMessage(), e);
        throw e;
    }

}
