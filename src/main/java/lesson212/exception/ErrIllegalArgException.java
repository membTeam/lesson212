package lesson212.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ErrIllegalArgException extends RuntimeException {
    public ErrIllegalArgException(String err) {
        super(err);
    }
}
