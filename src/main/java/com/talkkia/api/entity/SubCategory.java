package com.talkkia.api.entity;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class SubCategory {

    @Id
    Long subCatID;
    String subCatName;
    String subCatPic;
    @Relationship
    List<User> subscriber;
}
