package com.pixeltrice.springbootelasticsearchapplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    // getters and setters
}
