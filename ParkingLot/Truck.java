package ParkingLot;

public class Truck extends Vehicle {
    int ticketPrice;

    public Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
        ticketPrice = 40;
    }

}
