
package com.curdexample.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name="First_Name",nullable=false)
	private String FirstName;
	
	@Column(name="Last_Name")
	private String LastName;
	
	@Column(name="email")
	private String email;
	
	
	
}
