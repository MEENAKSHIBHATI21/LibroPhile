package com.librophile.controller;

import com.librophile.dao.BookRepository;
import com.librophile.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @GetMapping("/recommend/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre) {
        return bookRepo.findByGenre(genre);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepo.save(book);
    }

    // ✅ THIS is the method you recently added
    @PostMapping("/add")
    public String addBookViaForm(@RequestParam String title,
                                 @RequestParam String author,
                                 @RequestParam String genre,
                                 @RequestParam float rating) {
        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setGenre(genre);
        newBook.setRating(rating);

        bookRepo.save(newBook);
        return "redirect:/index.html";
    }
}
