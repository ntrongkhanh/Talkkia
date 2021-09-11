package com.talkkia.api.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Category {

    @Id
    Long catID;
    String catName;
    String catPic;
    @Relationship
    List<SubCategory> subcategories;
    @Relationship
    List<User> subscriber;
}
