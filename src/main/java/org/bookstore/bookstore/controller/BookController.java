package org.bookstore.bookstore.controller;
import java.util.*;

import org.bookstore.bookstore.model.Book;
import org.bookstore.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * @author Ravanth Pasam
 *
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/index")
    public String index(){
        return "index.html";
    }

    @GetMapping("/search")
    public List<Book> searchBook(@RequestParam String title) {
        return bookService.searchBook(title);
    }

    @GetMapping("/{id}")
    public  Book bookIdSearch(@PathVariable String id) {
        return bookService.sestchBookbyId(id);
    }
}
