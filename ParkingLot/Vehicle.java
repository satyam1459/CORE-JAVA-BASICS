package ParkingLot;

public class Vehicle {
    private String vehicleNumber;
    private String ownerName;

    public Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    public String getvehicleNumber() {
        return this.vehicleNumber;
    }

    public void setvehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
