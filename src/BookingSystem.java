class BookingSystem {
    private Flight[] flights = new Flight[10];
    private Booking[] bookings = new Booking[10];
    private int flightCount = 0;
    private int bookingCount = 0;

    public Booking findBooking(Flight flight){
        if(this.bookings.length > 0) {
            for (int i = 0; i < this.bookings.length; i++) {
                if (this.bookings[i] != null && this.bookings[i].getFlight().equals(flight.getFlightNumber())) {
                    return bookings[i];
                }
            }
        }
        return null;
    }
    public void addFlight(Flight flight) {
        if (flightCount < 10) {
            flights[flightCount++] = flight;
        } else {
            System.out.println("Cannot add more flights. Booking system is full.");
        }
    }

    public void createBooking(Flight flight, Passenger passenger) {
        Booking existingBooking;
        if (bookingCount < 10) {
            existingBooking = this.findBooking(flight);
            if(existingBooking == null) {
                bookings[bookingCount++] = new Booking(flight);
                bookings[bookingCount - 1].addPassenger(passenger);
            }
            else{
                existingBooking.addPassenger(passenger);
            }
        } else {
            System.out.println("Cannot create more bookings. Booking system is full.");
        }
    }

    public void listBookings() {
        for (int i = 0; i < bookingCount; i++) {
            bookings[i].printBookingDetails();
            System.out.println();
        }
    }
}