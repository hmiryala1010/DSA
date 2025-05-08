package parkinglot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot { // holds levels //manages entry, exit, status
	String name;
	List<ParkingSlot> slot; 
	List<Entrance> entrance;
	List<Exit> exit;
	Display display;
	Map<Integer, ParkingLevel> parkingLevels=new HashMap<>();
	Map<String,ParkingSlot> occupiedSlots=new HashMap<>();
	private Map<EnumVehicleType, Integer> hourlyRates = Map.of(
		        EnumVehicleType.BIKE, 1,
		        EnumVehicleType.CAR, 2,
		        EnumVehicleType.BUS, 5
		    );
	
	
	
	
	boolean addLevel(int levelId,int bikes, int cars, int buses) {
		if(parkingLevels.containsKey(levelId)) return false;
		ParkingLevel newlevel=new ParkingLevel(levelId,bikes,cars,buses);
		parkingLevels.put(levelId,newlevel);
		
		return true ;

	}

	String parkVehicle(Vehicle v) {
		for(ParkingLevel level:parkingLevels.values()) {
			ParkingSlot slot=level.findAvailableSlot(v);
			if(slot!=null) {
				slot.park(v);
				occupiedSlots.put(v.getLicensePlate(),slot);
				return v.getType()+"vehicle parked"+ v.getLicensePlate()+"at level"+
				level.id+ " slot"+ slot.id;
			}
			
		}
		
		return "no available slots for"+ v.getType();

	}

	String exitVehicle(String licensePlate) {
		ParkingSlot slot=occupiedSlots.get(licensePlate); 
		if(slot==null) return "vehicle not found";
		long parkedMillis=slot.freeUp();
		int hours=(int) Math.ceil(parkedMillis/(1000.0*60*60));
		int fee=hours*hourlyRates.get(slot.getVehicle().getType());
		occupiedSlots.remove(licensePlate);
		return slot.toString()+"fee is "+fee;

	}

	String viewStatus() {
		StringBuilder sb = new StringBuilder();
	    for (ParkingLevel level : parkingLevels.values()) {
	        sb.append("Level ").append(level.getId()).append(": ")
	          .append(level.getStatus()).append("\n");
	    }
	    return sb.toString();


	}

	String addSlots(int levelId,EnumVehicleSlotType type, int count) {
		ParkingLevel level=parkingLevels.get(levelId);
		if(level==null) return "level not found";
		level.addSlots(type, count);
		return count+"added to "+level.toString();

	}

	String removeSlots(int levelId,EnumVehicleSlotType type, int count) {
		ParkingLevel level=parkingLevels.get(levelId);
		if(level==null) return "level not found";
		level.removeSlots(type, count);
		return count+"removed from "+level.toString();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ParkingSlot> getSlot() {
		return slot;
	}

	public void setSlot(List<ParkingSlot> slot) {
		this.slot = slot;
	}

	public List<Entrance> getEntrance() {
		return entrance;
	}

	public void setEntrance(List<Entrance> entrance) {
		this.entrance = entrance;
	}

	public List<Exit> getExit() {
		return exit;
	}

	public void setExit(List<Exit> exit) {
		this.exit = exit;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
	public void setParkinglevel(Map<Integer, ParkingLevel> parkinglevel) {
		this.parkingLevels = parkinglevel;
	}


}
