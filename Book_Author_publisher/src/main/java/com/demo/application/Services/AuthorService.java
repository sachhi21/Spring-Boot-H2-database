package com.demo.application.Services;

import com.demo.application.Domain.Author;
import com.demo.application.Domain.Book;

public interface AuthorService {
    Iterable<Author> findall();

}
