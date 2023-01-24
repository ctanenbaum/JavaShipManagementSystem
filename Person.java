package ship;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Person {
	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate birthdate;
	private Address address;

	public Person(String f, String l, Gender g, Address add, String birthdate) {
		firstName = f;
		lastName = l;
		gender = g;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		this.birthdate = LocalDate.parse(birthdate, formatter); //change  datatype
		address = new Address(add);                 //call address constructor
		
	}
	
	public Person(String f, String l, Gender g, String s, String c, String state, String zip, String birthdate) {
		
		firstName = f;
		lastName = l;
		gender = g;
		this.birthdate = LocalDate.parse(birthdate);
		address = new Address(s, c, state, zip);
	}
	
	public Person(String f, String l, Gender g, Address add, LocalDate birthday) {
		firstName = f;
		lastName = l;
		gender = g;
		address = add;
		birthdate = birthday;
	}
	
	public Person(Person p){
		this.firstName = p.firstName;
		this.lastName = p.lastName;
		this.gender = p.gender;
	} 
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setLastName(String last) {
		lastName = last;
	}
	
	public void setAddress(Address addr) {
		address = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();		
		str.append("\nFirst Name: " + firstName);
		str.append("\nLast Name: " + lastName);
		str.append("\nGender: " + gender);
		str.append("\nAddress: " + address);
		str.append("\nBirthday: " + birthdate);
		return str.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName != other.firstName)
			return false;
		if(lastName != other.lastName)
			return false;
		if(birthdate != other.birthdate)
			return false;
		return true;
	}
}
