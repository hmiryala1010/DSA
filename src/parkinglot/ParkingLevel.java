package parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel { //hold slots //manages slots by type
	
	
	int id;
	List<ParkingSlot> bikeSlots;
	List<ParkingSlot> busSlots;
	List<ParkingSlot> carSlots;
	
    public ParkingSlot findAvailableSlot(Vehicle vehicle) {
    	if(vehicle.getType()==EnumVehicleType.BIKE) {
    		for(ParkingSlot slot:bikeSlots)
    			if(slot.isAvailable) return slot;
    		for(ParkingSlot slot:busSlots)
    			if(slot.isAvailable) return slot;
    		for(ParkingSlot slot:carSlots)
    			if(slot.isAvailable) return slot;
    	}
    	if(vehicle.getType()==EnumVehicleType.CAR) {
    		for(ParkingSlot slot:carSlots)
    			if(slot.isAvailable) return slot;
    		for(ParkingSlot slot:busSlots)
    			if(slot.isAvailable) return slot;
    	}
    	if(vehicle.getType()==EnumVehicleType.BUS) {
    		for(ParkingSlot slot:busSlots)
    			if(slot.isAvailable) return slot;
    	}
    	
    	
		return null;
        // search slot lists based on vehicle type
    }

    public void addSlots(EnumVehicleSlotType slotType, int count) { /* add slots */ }
    public void removeSlots(EnumVehicleSlotType slotType, int count) { /* remove slots */ }

    public String getStatus() {
		return null;
        // return string summary of available/occupied slots
    }
    public ParkingLevel(int id, int bikeCount, int carCount, int busCount) {
        this.id = id;
        this.bikeSlots = new ArrayList<>();
        this.carSlots = new ArrayList<>();
        this.busSlots = new ArrayList<>();

        addSlots(EnumVehicleSlotType.BIKE_SLOT, bikeCount);
        addSlots(EnumVehicleSlotType.CAR_SLOT, carCount);
        addSlots(EnumVehicleSlotType.BUS_SLOT, busCount);
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<ParkingSlot> getBikeSlots() {
		return bikeSlots;
	}
	public void setBikeSlots(List<ParkingSlot> bikeSlots) {
		this.bikeSlots = bikeSlots;
	}
	public List<ParkingSlot> getBusSlots() {
		return busSlots;
	}
	public void setBusSlots(List<ParkingSlot> busSlots) {
		this.busSlots = busSlots;
	}
	public List<ParkingSlot> getCarSlots() {
		return carSlots;
	}
	public void setCarSlots(List<ParkingSlot> carSlots) {
		this.carSlots = carSlots;
	}

}
