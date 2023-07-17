package com.demo.application.Services;

import com.demo.application.Domain.Book;
import com.demo.application.Repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findall(){
        return bookRepository.findAll();
    }
}
