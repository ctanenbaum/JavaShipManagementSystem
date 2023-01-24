package ship;
import java.util.*;
import java.io.*;

public class CruiseShip extends Ship {   //extend ship class
	private int max;
	private ArrayList<Passenger> passenger;  //call passenger arraylist

	public CruiseShip() {     //constructors
		max = 0;
		this.passenger = new ArrayList<Passenger>();
	}
	
	public CruiseShip(String name, int year, int max) {
		super(name, year);
		if(max > 0) {
			this.max = max;
		}
		this.passenger = new ArrayList<Passenger>();
	}
	
	public CruiseShip(int max, String name, int year, ArrayList<Passenger> passenger) {
		super(name, year);
		if(max > 0) {
			this.max = max;
		}
		this.passenger = passenger;
	}
	
	
	public void setMax(int max) {   //set max
		if(max > 0) {
			this.max = max;
		}
	}

		
	public int getMax() {   //get max
		return max;
	}
	
	public ArrayList<Passenger> getPassengers() {       //return passenger arraylist
		return new ArrayList <Passenger> (passenger);
		
	}
	
	public void add(Passenger i) throws PassengerExistsException{        //check if passenger exists and if less that max capacity
			if(!passenger.contains(i) && passenger.size() < max) {
				passenger.add(i);
			}
			else throw new PassengerExistsException();
		
		
		

	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("\nName: " + super.getShip().toString());
		str.append("\nYear built: " + super.getYearBuilt());
		str.append("\nMaximum number of passengers: " + max);
		str.append(passenger.toString());
		return str.toString();
	}
	
}
