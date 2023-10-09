public class Main {
    public static void main(String[] args) {
        // Create a flight
        Flight flight1 = new Flight("F001", "New York", 150);
        Flight flight2 = new Flight("F002", "California", 150);

        // Create passengers
        Passenger passenger1 = new Passenger("John Smith", "ABC12345", PassengerClass.ECONOMY);
        Passenger passenger2 = new Passenger("Alice Johnson", "XYZ67890", PassengerClass.BUSINESS);
        Passenger passenger3 = new Passenger("Alex Kirwan", "LMN12345", PassengerClass.ECONOMY);

        // Create a booking system
        BookingSystem bookingSystem = new BookingSystem();
        bookingSystem.addFlight(flight1);
        bookingSystem.addFlight(flight2);

        // Create bookings
        bookingSystem.createBooking(flight1, passenger1);
        bookingSystem.createBooking(flight1, passenger2);
        bookingSystem.createBooking(flight2, passenger3);

        // List bookings
        bookingSystem.listBookings();
    }
}