package com.demo.application.Controller;

import com.demo.application.Domain.Book;
import com.demo.application.Repositories.BookRepository;
import com.demo.application.Services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;

    private final BookRepository bookRepository;

    public BookController(BookService bookService, BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getbooks(Model model){
        model.addAttribute("books" , bookService.findall());
        return "books";
    }



}
