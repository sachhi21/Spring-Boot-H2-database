package com.demo.application.BootStrap;

import com.demo.application.Domain.Author;
import com.demo.application.Domain.Book;
import com.demo.application.Domain.Publisher;
import com.demo.application.Repositories.AuthorRepository;
import com.demo.application.Repositories.BookRepository;
import com.demo.application.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author sachin = new Author();
        sachin.setFirstname("sachin");
        sachin.setLastname("R");

        Book book = new Book();
        book.setTitle("Wisdom Man");
        book.setIsbn("sac001");

        Publisher publish = new Publisher();
        publish.setPublisherName("sachin co print");
        publish.setAddress("ram murthi  nagar");
        publish.setCity("bangalore");
        publish.setState("karnataka");
        publish.setZip("562106");



        Book booksaved = bookRepository.save(book);
        Author authorsaved = authorRepository.save(sachin);
        Publisher publishsaved = publisherRepository.save(publish);

        Author sachin1 = new Author();
        sachin1.setFirstname("sidharth");
        sachin1.setLastname("S");

        Book book1 = new Book();
        book1.setTitle("Wisdom Kill");
        book1.setIsbn("sac002");

        Publisher publish1 = new Publisher();
        publish1.setPublisherName("aryan co print");
        publish1.setAddress("electronic city");
        publish1.setCity("bangalore");
        publish1.setState("karnataka");
        publish1.setZip("562100");



        Book booksaved1 = bookRepository.save(book1);
        Author authorsaved1 = authorRepository.save(sachin1);
        Publisher publishsaved1 = publisherRepository.save(publish1);


        authorsaved.getBooks().add(booksaved);
        authorsaved1.getBooks().add(booksaved1);
        booksaved.getAuthors().add(authorsaved);
        booksaved1.getAuthors().add(authorsaved1);

        booksaved.setPublisher(publishsaved);
        booksaved1.setPublisher(publishsaved1);

        authorRepository.save(authorsaved1);
        authorRepository.save(authorsaved);
        bookRepository.save(booksaved);
        bookRepository.save(booksaved1);


        System.out.println("in bootstrap");
        System.out.println("Author Count" + authorRepository.count());
        System.out.println("Book Count" + bookRepository.count());
        System.out.println("Punlisher count" + authorRepository.count());

    }
}
