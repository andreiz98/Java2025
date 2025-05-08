package com.BookAPI.bookAPI.service;

import com.BookAPI.bookAPI.model.Book;
import com.BookAPI.bookAPI.rep.BookRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRep rep;

    public List<Book> findAll(){
        return rep.findAll();
    }

    public Book findByTitle(String title){
        return rep.findByTitle(title);
    }

    public Book addBook(Book book){
        return rep.save(book);
    }

    public void delete(String title){
        rep.delete(title);
    }
}
