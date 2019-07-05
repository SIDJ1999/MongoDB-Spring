package com.techprimers.mongodb.springbootmongodbexample.resource;

import com.techprimers.mongodb.springbootmongodbexample.document.employee;
import com.techprimers.mongodb.springbootmongodbexample.repository.employeeRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/employee")
public class EmpResource {
	
	
    private employeeRepo employeeRepo;
    
    @Autowired
    public EmpResource(employeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @GetMapping("/all")
    public List<employee> getAll() {
        return employeeRepo.findAll();
    }
    @PostMapping("/new")
    public String postAll(@RequestBody employee emp)
    {
    	 employeeRepo.save(emp);
    	 return "Data Entered";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmp(@PathVariable int id)
    {
    	employeeRepo.delete(id);
    	return "Deleted";
    }
    @PutMapping("/update/{id}")
    public String update(@RequestBody employee employee)
    {
    	employee e = employeeRepo.save(employee);
    	return e.toString();
    }
}
