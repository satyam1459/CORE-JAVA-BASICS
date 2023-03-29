package ParkingLot;

public class Car extends Vehicle {
    int ticketPrice;

    public Car(String vehicleNumber, String ownerName, int ticketPrice) {
        super(vehicleNumber, ownerName);
        ticketPrice = 20;
    }

}
