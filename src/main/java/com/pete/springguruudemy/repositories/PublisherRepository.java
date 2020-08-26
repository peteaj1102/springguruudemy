package com.pete.springguruudemy.repositories;

import com.pete.springguruudemy.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Petea on 17:12 26 Aug, 2020
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
