package com.techprimers.mongodb.springbootmongodbexample.repository;

import com.techprimers.mongodb.springbootmongodbexample.document.employee;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface employeeRepo extends MongoRepository<employee, Integer> {
}
