package com.techprimers.mongodb.springbootmongodbexample.resource;

import com.techprimers.mongodb.springbootmongodbexample.document.Department;
import com.techprimers.mongodb.springbootmongodbexample.repository.DepartmentRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/department")
public class DepResource {

    private DepartmentRepo DepartmentRepo;

    public DepResource(DepartmentRepo DepartmentRepo) {
        this.DepartmentRepo = DepartmentRepo;
    }

    @GetMapping("/all")
    public List<Department> getAll() {
        return DepartmentRepo.findAll();
    }
    @PostMapping("/new")
    public String postAll(@RequestBody Department dep)
    {
    	 DepartmentRepo.save(dep);
    	 return "Data Entered";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDep(@PathVariable int id)
    {
    	DepartmentRepo.delete(id);
    	return "Deleted";
    }
    @PutMapping("/update/{id}")
    public String update(@RequestBody Department department)
    {
    	Department e = DepartmentRepo.save(department);
    	return e.toString();
    }
    
}