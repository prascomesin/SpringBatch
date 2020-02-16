/**
 * Create a domain person class which needs to be transformed using Spring Batch processing
 */
package com.PrasadCo.Batch.SpringBatch.domain;

/**
 * @author Prasad Kanvinde
 *
 */
public class Person {
	
	private String firstName;
	private String lastName;
	
	public Person(){
		
	}
	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
