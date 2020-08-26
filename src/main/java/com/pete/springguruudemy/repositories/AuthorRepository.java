package com.pete.springguruudemy.repositories;

import com.pete.springguruudemy.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Petea on 16:51 26 Aug, 2020
 */
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
