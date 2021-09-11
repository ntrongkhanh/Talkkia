package com.talkkia.api.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Article {

    @Id
    private Long articleID;
    private String articleURL;
    private int likes;
    private int dislikes;
    private int shared;
    @Relationship
    private List<Category> categories;
    @Relationship
    private List<SubCategory> subCategories;
}
