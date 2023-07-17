package com.demo.application.Repositories;

import com.demo.application.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher , Long> {
}
