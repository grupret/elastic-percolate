package com.pixeltrice.springbootelasticsearchapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/{lastName}")
    public Flux<Person> getPersonsByLastName(@PathVariable String lastName) {
        Person entity = new Person("2", "yes", "boss");
        personRepository.insert(entity);
        Flux<Person> byLastName = personRepository.findByLastName(lastName);
        System.out.println(byLastName.last().block());
        return byLastName;
    }
}
