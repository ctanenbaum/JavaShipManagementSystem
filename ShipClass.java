package ship;
import java.time.format.DateTimeParseException;
import java.util.*;

public class ShipClass {

	public ShipClass() {
		
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		  
		cruiseShips(keyboard);                          //call cruise ship method
		cargoShips(keyboard);                         //call cargo ship method
		}
		

	
	public static void cruiseShips(Scanner keyboard) {
		ArrayList <CruiseShip> cruises = new ArrayList();                    //create arraylist to hold cruises
		int addShip = 0;
		int addPassenger = 0;
		do {
			System.out.println("Enter the name of your cruise: ");           //get info for each cruise
			String name = keyboard.nextLine();
			System.out.println("Enter the year your cruise was built: ");
			int year = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Enter the maximum number of passengers: ");
			int max = keyboard.nextInt();
			keyboard.nextLine();
			CruiseShip cruise = new CruiseShip(name, year, max);
			
			do {
				getPassengerinfo(keyboard, cruise);                         //call method to get each passenger for each cruise
				keyboard.nextLine();
				System.out.println("Do you want to add another passenger? Enter 0 for no and 1 for yes: ");
				addPassenger = keyboard.nextInt();
				keyboard.nextLine();
			}
			while(addPassenger == 1);
			cruises.add(cruise);
			System.out.println("Do you want to add another ship? Enter 0 for no and 1 for yes: ");
			addShip = keyboard.nextInt();
		    keyboard.nextLine();
		}
		while(addShip == 1);
		
		for(int i = 0; i < cruises.size(); i++) {                 //print to info for each cruise and all passengers in each cruise
			CruiseShip curCruise = cruises.get(i);
			String pass = curCruise.toString();
			System.out.println("Cruise ship info: " + pass);
			System.out.println();
		}
		System.out.println("Press enter to place your cargo ship information.");
	}

	public static void getPassengerinfo(Scanner keyboard, CruiseShip cruise) {
		try {
			System.out.println("Enter passenger's first name: ");               //get all passenger's info
			String fname = keyboard.nextLine();
			System.out.println("Last name: ");
			String lname = keyboard.nextLine();
			System.out.println("Gender: ");
			String gender = keyboard.nextLine();
			Gender g;
			if(gender.toLowerCase() == "male") {
				g = Gender.Male;
			}
			else {
				g = Gender.Female;
			}
			System.out.println("Enter passenger's address: ");
			System.out.println("Street: ");
			String street = keyboard.nextLine();
			System.out.println("City: ");
			String city = keyboard.nextLine();
			System.out.println("State: ");
			String state = keyboard.nextLine();
			System.out.println("Zipcode: ");
			String zip = keyboard.nextLine();
			Address addr = (new Address(street, city, state, zip));
			String birthdate;
			try {
				System.out.println("Birthday: ");
				birthdate = keyboard.nextLine();	
			}
			catch(DateTimeParseException e) {
				e.getMessage();
				System.out.println("Your must enter the date in the proper format - yyyy mm dd");
				System.out.println("Birthday: ");
				birthdate = keyboard.nextLine();	
			}
			System.out.println("Passport ID: ");
			String passportID = keyboard.nextLine();
			System.out.println("Number of luggage pieces: ");
			int luggagePieces = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println();
			Passenger p = new Passenger(fname, lname, g, addr, birthdate, passportID, luggagePieces);
			cruise.add(p);                                           //add info to passenger
			
		}
		catch(PassengerExistsException e)
		{
			System.out.println("Passenger already exists.");
		}
		}
		
	public static void cargoShips(Scanner keyboard) {
		ArrayList <CargoShip> cargoShips = new ArrayList();                   //create cargo ship array
		int addShip = 0;
		String name;
		int cap;
		do {
			keyboard.nextLine();
			System.out.println("Enter the name of your ship: ");              //get info
			name = keyboard.nextLine();
			System.out.println("What is the cargo capacity? ");
			cap = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Do you want to add another cargo ship? Enter 0 for no and 1 for yes:");
			addShip = keyboard.nextInt();
			keyboard.nextLine();
			CargoShip cargo = new CargoShip(name, cap);
			cargoShips.add(cargo);
		}
		while(addShip == 1);
		
		
		for(int i = 0; i < cargoShips.size(); i++) {
			System.out.println("Ship info: " + cargoShips.get(i).toString()); //print to cargo ship info
			System.out.println();
		}
	}

}
