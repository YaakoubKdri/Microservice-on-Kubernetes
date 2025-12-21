package com.kadri.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface K8sDemoRepository extends MongoRepository<Message, String> {
}
