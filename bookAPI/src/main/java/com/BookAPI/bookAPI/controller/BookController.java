package com.BookAPI.bookAPI.controller;

import com.BookAPI.bookAPI.model.Book;
import com.BookAPI.bookAPI.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/books")
public class BookController {

    @Autowired
    BookService service;

    @GetMapping
    public ResponseEntity<List<Book>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{title}")
    public ResponseEntity<Book> getBookByTitle(@PathVariable String title) {
        Book book = service.findByTitle(title);
        if (book == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(book);
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return ResponseEntity.ok(service.addBook(book));
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteBook (@PathVariable String title) {
        service.delete(title);
        return ResponseEntity.noContent().build();
    }

}
