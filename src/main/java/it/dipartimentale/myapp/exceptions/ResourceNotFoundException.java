package it.dipartimentale.myapp.exceptions;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

@Slf4j
@Getter
@Setter
public class ResourceNotFoundException extends HttpException {

    public ResourceNotFoundException() {

        super(HttpStatus.NOT_FOUND);
    }

    public ResourceNotFoundException(String message) {

        super(HttpStatus.NOT_FOUND, message);
    }

    static public ResourceNotFoundException raise(String message, Object... args) throws ResourceNotFoundException {
        ResourceNotFoundException e = new ResourceNotFoundException(String.format(message, args));
        log.debug(e.getMessage(), e);
        throw e;
    }

}
