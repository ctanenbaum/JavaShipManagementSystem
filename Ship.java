package ship;

public class Ship {

	private String ship;
	private int yearBuilt;
	
	public Ship() {  //constructors
		ship = "";
		yearBuilt = 0;
	}
	
	public Ship(String ship) {
		this.ship = ship;
		yearBuilt = 0;
	}
	
	public Ship(int yearBuilt) {
		ship = "";
		if(yearBuilt > 0) {
			this.yearBuilt = yearBuilt;
		}
	}
	
	public Ship(String ship, int yearBuilt) {
		this.ship = ship;
		if(yearBuilt > 0) {
			this.yearBuilt = yearBuilt;
		}
		
	}

	public void setShip(String ship) {   //setters
		this.ship = ship;
	}
	
	public void setYearBuilt(int yearBuilt) {
		if(yearBuilt > 0) {
			this.yearBuilt = yearBuilt;
		}
		
	}
	
	public String getShip() {      //getters
		return ship;
	}
	
	public int getYearBuilt() {
		return yearBuilt;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Ship");
		str.append("\nShip name: " + ship);
		str.append("\nYear Built: " + yearBuilt);
		return str.toString();
	}
}
