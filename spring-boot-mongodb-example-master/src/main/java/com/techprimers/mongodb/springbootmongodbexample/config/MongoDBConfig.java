/*package com.techprimers.mongodb.springbootmongodbexample.config;

import com.techprimers.mongodb.springbootmongodbexample.document.employee;
import com.techprimers.mongodb.springbootmongodbexample.repository.employeeRepo;
import com.techprimers.mongodb.springbootmongodbexample.document.Department;
import com.techprimers.mongodb.springbootmongodbexample.repository.DepartmentRepo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = employeeRepo.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(employeeRepo employeeRepo,DepartmentRepo DepartmentRepo) {
        return strings -> {
            employeeRepo.save(new employee(1, "Peter", 3000L));
            employeeRepo.save(new employee(2, "Nick", 4000L));
        	employeeRepo.save(new employee(3, "Sam", 2000L));
            DepartmentRepo.save(Arrays.asList(new Department(100,"CVT","Laxmi Nagar",Arrays.asList(new employee(1, "Sam", 2000L),new employee(2, "Nick", 4000L)))));
            DepartmentRepo.save(Arrays.asList(new Department(200,"Concirrus","NOIDA",Arrays.asList(new employee(3, "Peter", 3000L)))));
        };
    }

}*/
