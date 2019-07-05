package com.techprimers.mongodb.springbootmongodbexample.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
@Document
public class Department {
	

	    @Id
	    private Integer id;
	    private String orgname;
	    private String location;
		@DBRef
	    private List<employee> employee;
	    
	    public Department() {}
		public Department(Integer id, String orgname, String location,
				List<com.techprimers.mongodb.springbootmongodbexample.document.employee> employee) {
			super();
			this.id = id;
			this.orgname = orgname;
			this.location = location;
			this.employee = employee;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getOrgname() {
			return orgname;
		}
		public void setOrgname(String orgname) {
			this.orgname = orgname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public List<employee> getEmployee() {
			return employee;
		}
		public void setEmployee(List<employee> employee) {
			this.employee = employee;
		}
		
		@Override
	    public String toString() {
	      ObjectMapper mapper = new ObjectMapper();
	      
	      String jsonString = "";
	    try {
	      mapper.enable(SerializationFeature.INDENT_OUTPUT);
	      jsonString = mapper.writeValueAsString(this);
	    } catch (JsonProcessingException e) {
	      e.printStackTrace();
	    }
	    
	      return jsonString;
	    }

		
		
	    
}
