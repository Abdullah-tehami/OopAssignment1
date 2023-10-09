class Passenger {
    private String name;
    private String passportNumber;
    private PassengerClass passengerClass;

    public Passenger(String  name, String passportNumber, PassengerClass passengerClass) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.passengerClass = passengerClass;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public PassengerClass getPassengerClass() {
        return passengerClass;
    }
}
