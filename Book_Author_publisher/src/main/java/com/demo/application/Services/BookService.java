package com.demo.application.Services;

import com.demo.application.Domain.Book;

public interface BookService {
    Iterable<Book> findall();
}
