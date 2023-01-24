package ship;

public class PassengerExistsException extends Exception {
	public PassengerExistsException(String string) {
		super("Error: Passenger exists: " + string);
	}
	public PassengerExistsException() {
		super("Error: Passenger exists");
	}
}
