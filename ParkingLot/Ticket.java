package ParkingLot;

import java.time.LocalDateTime;

public class Ticket {
    Vehicle type;
    int slotNumber;
    String vehicleNumber;
    LocalDateTime entry;

    Ticket(Vehicle type, int slotNumber, String vehicleNumber, LocalDateTime entry) {
        this.type = type;
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.entry = LocalDateTime.now();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.slotNumber).append("-->").append(this.vehicleNumber)
    }
}
