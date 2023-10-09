class Booking {
    private Flight flight;
    private Passenger[] passengers = new Passenger[10];
    private int passengerCount = 0;

    public Booking(Flight flight) {
        this.flight = flight;
    }

    public String getFlight(){
        return this.flight.getFlightNumber();
    }
    public void addPassenger(Passenger passenger) {
        if (passengerCount < 10) {
            passengers[passengerCount++] = passenger;
            flight.bookSeat(passenger.getPassengerClass());
        } else {
            System.out.println("Booking is full. Cannot add more passengers.");
        }
    }

    public void printBookingDetails() {
        System.out.println("Flight: " + flight.getFlightNumber());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Passengers:");
        for (int i = 0; i < passengerCount; i++) {
            System.out.println(" - " + passengers[i].getName() + " (Passport: " + passengers[i].getPassportNumber() + ")");
        }
    }
}
