package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@Setter
public class DuplicateKeyException extends HttpException {

    public DuplicateKeyException() {
        super(HttpStatus.CONFLICT);
    }

    public DuplicateKeyException(String message) {
        super(HttpStatus.CONFLICT, message);
    }

    static public DuplicateKeyException raise(String message, Object... args) throws DuplicateKeyException {
        DuplicateKeyException e = new DuplicateKeyException(String.format(message, args));
        log.debug(e.getMessage(), e);
        throw e;
    }

}
