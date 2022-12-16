package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@Setter
public class ForbiddenException extends HttpException {

    public ForbiddenException() {
        super(HttpStatus.FORBIDDEN);
    }

    public ForbiddenException(String message) {
        super(HttpStatus.FORBIDDEN, message);
    }

    static public ForbiddenException raise(String message, Object... args) throws ForbiddenException {
        ForbiddenException e = new ForbiddenException(String.format(message, args));
        log.debug(e.getMessage(), e);
        throw e;
    }

}
