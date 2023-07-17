package com.demo.application.Repositories;

import com.demo.application.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author , Long> {
}
