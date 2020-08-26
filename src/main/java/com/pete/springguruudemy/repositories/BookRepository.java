package com.petea.springguruudemy.repositories;

import com.petea.springguruudemy.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Petea on 16:54 26 Aug, 2020
 */
public interface BookRepository extends CrudRepository<Book,Long> {
}
