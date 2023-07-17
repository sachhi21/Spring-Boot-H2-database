package com.demo.application.Services;

import com.demo.application.Domain.Author;
import com.demo.application.Repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl  implements AuthorService{


    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findall() {
        return authorRepository.findAll();
    }
}
