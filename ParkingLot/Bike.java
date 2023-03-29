package ParkingLot;

public class Bike extends Vehicle {

    int ticketPrice;

    public Bike(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
        ticketPrice = 10;

    }

}
