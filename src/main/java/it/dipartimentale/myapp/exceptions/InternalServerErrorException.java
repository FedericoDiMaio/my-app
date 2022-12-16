package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@Setter
public class InternalServerErrorException extends HttpException {

    public InternalServerErrorException() {

        super(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public InternalServerErrorException(String message) {

        super(HttpStatus.INTERNAL_SERVER_ERROR, message);
    }

    static public InternalServerErrorException raise(String message, Object... args) throws InternalServerErrorException {
        InternalServerErrorException e = new InternalServerErrorException(String.format(message, args));
        log.debug(e.getMessage(), e);
        throw e;
    }

}
