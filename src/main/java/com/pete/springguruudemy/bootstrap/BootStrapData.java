package com.petea.springguruudemy.bootstrap;

import com.petea.springguruudemy.model.Author;
import com.petea.springguruudemy.model.Book;
import com.petea.springguruudemy.model.Publisher;
import com.petea.springguruudemy.repositories.AuthorRepository;
import com.petea.springguruudemy.repositories.BookRepository;
import com.petea.springguruudemy.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Petea on 16:55 26 Aug, 2020
 */

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;


    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository=publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric= new Author("Eric","Evans");
        Book carabian = new Book("Carabian", "123");
        eric.getBooks().add(carabian);
        carabian.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(carabian);

        Author rod=new Author("Rod", "Jomson");
        Book aded=new Book("Aded","1234");

        rod.getBooks().add(aded);
        aded.getAuthors().add(rod);


        authorRepository.save(rod);
        bookRepository.save(aded);

        System.out.println("Starter in Bootstrap");
        System.out.println("Number of books: "+bookRepository.count());


        Publisher publisher1=new Publisher("One","Etica","Chisinau","Moldova","2001");
        Publisher publisher2=new Publisher("Two","Etic","Chisinau","Moldova","2002");

        aded.setPublisher(publisher1);
        carabian.setPublisher(publisher1);

        publisher1.getBooks().add(aded);
        publisher1.getBooks().add(carabian);

        publisherRepository.save(publisher1);
        publisherRepository.save(publisher2);



        System.out.println("Number of publishers: "+publisherRepository.count());
        System.out.println("Publisher numbeer of books: "+publisher1.getBooks().size());
    }
}
