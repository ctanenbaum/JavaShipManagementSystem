package ship;

public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;

	public Address() {         //constructors
		street = "";
		city = "";
		state = "";
		zipcode = "";
	}
	public Address(String street, String city, String state, String zipcode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public Address(Address a) {     //copy constructor
		this.street = a.street;
		this.city = a.city;
		this.state = a.state;
		this.zipcode = a.zipcode;
	}
	
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zipcode;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Address");
		str.append("\nStreet: " + street);
		str.append("\nCity: " + city);
		str.append("\nState: " + state);
		str.append("\nZipcode: " + zipcode);
		return str.toString();
	}

}
