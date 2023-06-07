package com.pixeltrice.springbootelasticsearchapplication;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
    Flux<Person> findByLastName(String lastName);
}
