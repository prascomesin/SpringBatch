package com.PrasadCo.Batch.SpringBatch.Processor;

import org.springframework.batch.item.ItemProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.PrasadCo.Batch.SpringBatch.domain.Person;

public class BusinessProcessor implements ItemProcessor<Person,Person> {
	
	private static final Logger log = LoggerFactory.getLogger(BusinessProcessor.class);
	

	@Override
	public Person process(final Person person) throws Exception {
		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();
		
		return (new Person(firstName,lastName));
	}
	
	
	
	
	
	
	

}
