package com.talkkia.api.entity;

import org.springframework.data.annotation.Version;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;
import java.util.List;

@Node
public class User {

    @Id
    private Long id;
    @Version
    private Long version;
    private String name;
    private String dob;
    private String gender;
    private String mobile;
    private String email;
    private String address;
    private String picture;
    private String registrationDate;
    @Relationship
    List<User> contacts = new ArrayList<>();

}
