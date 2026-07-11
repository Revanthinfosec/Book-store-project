package org.bookstore.bookstore.exception;
import org.bookstore.bookstore.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * @author Ravanth Pasam
 *
 */

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(BookNotFound.class)
    public ResponseEntity<String> handleBookNotFound(BookNotFound exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
