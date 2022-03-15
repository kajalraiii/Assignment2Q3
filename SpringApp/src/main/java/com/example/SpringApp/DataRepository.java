package com.example.SpringApp;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends ReactiveMongoRepository<Value ,Integer> {
}
