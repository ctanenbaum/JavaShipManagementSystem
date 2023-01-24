package ship;

public class CargoShip extends Ship{  //extend ship class
	private int capacity;
	
	public CargoShip() {           //constructors
		capacity = 0;
	}
	
	public CargoShip(String name, int capacity) {
		super(name);
		if(capacity > 0) {
			this.capacity = capacity;
		}
		
	}
	public void setCapacity(int capacity) {   //setters
		
		if(capacity > 0) {
			this.capacity = capacity;
		}
		
	}
	
	public int getCapacity() {          //getters
		return capacity;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Cargo Ship");
		str.append("\nShip name: " + getShip());
		str.append("\nCapacity: " + capacity);
		return str.toString();
	}

}
