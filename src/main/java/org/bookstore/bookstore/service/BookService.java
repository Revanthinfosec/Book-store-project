package org.bookstore.bookstore.service;
import org.bookstore.bookstore.exception.BookNotFound;
import org.bookstore.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;
/**
 * @author Ravanth Pasam
 *
 */

@Service
public class BookService {

    List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book("1", "Java Book", "Revamth", 2024));
        books.add(new Book("2", "Springboot", "Rithvik", 2025));
        books.add(new Book("3", "Pythom", "Rajesh", 2026));
        books.add(new Book("4","sanskrit", "Sai", 2023));
    }

    public List<Book> searchBook(String title) {
        List<Book> result = new ArrayList<>();

        for (int i =0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getTitle().contains(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public Book sestchBookbyId(String id) {
        for (int i =0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return books.get(i);
        }
    }
        throw  new BookNotFound("Hey! the book is not found");
    }
}
