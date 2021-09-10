package com.talkkia.api.repositories;

import com.talkkia.api.entity.User;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveNeo4jRepository<User, Long> {

}