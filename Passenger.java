package ship;

public class Passenger extends Person{
	private String passportID;
	private int luggagePieces;

	public Passenger(String f, String l, Gender gender, Address addr, String birthdate, String passportID, int luggage) {
		super(f, l, gender, addr, birthdate);
		this.passportID = passportID;
		luggagePieces = luggage;
	
	}
	
	public Passenger(Passenger p) {
		super(p);
		this.passportID = p.passportID;
	}
	
	@Override
	public String toString() {
		StringBuilder str= new StringBuilder();
		str.append("\n Person: " + super.toString());
		str.append("\n Passport ID: " + passportID);
		str.append("\n Luggage Pieces: " + luggagePieces);
		return str.toString();
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		Passenger other = (Passenger) o;
		if(passportID != other.passportID)
			return false;
		return true;
					
		    
		
		
	}

}
