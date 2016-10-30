package com.hux.cleargo.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
@XmlAccessorType(XmlAccessType.PROPERTY) 
public class PersonListWrapper {
	
	private List<Person> persons;
	
	@XmlElement(name = "person")
	public List<Person> getPersons() {
		return persons;
	}
	
	public void setPersons(List<Person> persons) {
		for(Person person : persons)
		{
			System.out.println(person.toString());
		}
		this.persons = persons;
	}
}























