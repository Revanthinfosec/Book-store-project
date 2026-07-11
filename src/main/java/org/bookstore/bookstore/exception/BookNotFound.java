package org.bookstore.bookstore.exception;

/**
 * @author Ravanth Pasam
 *
 */
public class BookNotFound extends RuntimeException  {
    public BookNotFound(String message){
        super(message);
    }
}
