public class Flight {
    private String flightNumber;
    private String destination;
    private int totalSeats;
    private int[] seatsAvailableByClass = new int[PassengerClass.values().length];

    public Flight(String flightNumber, String destination, int totalSeats) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.totalSeats = totalSeats;
        for (int i = 0; i < seatsAvailableByClass.length; i++) {
            seatsAvailableByClass[i] = totalSeats / seatsAvailableByClass.length;
        }
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int[] getSeatsAvailableByClass() {
        return seatsAvailableByClass;
    }

    public void bookSeat(PassengerClass passengerClass) {
        int classIndex = passengerClass.ordinal();
        if (seatsAvailableByClass[classIndex] > 0) {
            seatsAvailableByClass[classIndex]--;
        } else {
            System.out.println("No available seats in " + passengerClass + " class on this flight.");
        }
    }
}