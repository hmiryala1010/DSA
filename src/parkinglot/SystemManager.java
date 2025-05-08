package parkinglot;

import java.util.Scanner;

public class SystemManager {

	ParkingLot parkingLot=new ParkingLot();
	
	public static void main(String[] args) {
		SystemManager manager=new SystemManager();
		Scanner sc=new Scanner(System.in);
		while(true) {
			String line=sc.nextLine();
			if(line.equalsIgnoreCase("exit")) break;
			manager.command(line);
		}
	sc.close();	
	}

	private void command(String line) {
		String[] parts=line.split(" ");
		String command=parts[0];
		switch(command) {
		 case "ADD_LEVEL":
             int levelId = Integer.parseInt(parts[1]);
             int mSlots = Integer.parseInt(parts[2]);
             int cSlots = Integer.parseInt(parts[3]);
             int bSlots = Integer.parseInt(parts[4]);
             parkingLot.addLevel(levelId, mSlots, cSlots, bSlots);
             System.out.println("Level " + levelId + " added with " +
                 mSlots + " motorcycle slots, " +
                 cSlots + " car slots, " +
                 bSlots + " bus slots.");
             break;

         case "PARK_VEHICLE":
             Vehicle vehicle = createVehicle(parts[1], parts[2]);
             String parkResult = parkingLot.parkVehicle(vehicle);
             System.out.println(parkResult);
             break;

         case "EXIT_VEHICLE":
             String exitResult = parkingLot.exitVehicle(parts[1]);
             System.out.println(exitResult);
             break;

         case "VIEW_STATUS":
             System.out.println(parkingLot.viewStatus());
             break;

         case "ADD_SLOTS":
             int addLevelId = Integer.parseInt(parts[1]);
             EnumVehicleSlotType slotType = EnumVehicleSlotType.valueOf(parts[2]);
             int numAdd = Integer.parseInt(parts[3]);
             parkingLot.addSlots(addLevelId, slotType, numAdd);
             System.out.println("Added " + numAdd + " " + slotType + " slots to level " + addLevelId + ".");
             break;

         case "REMOVE_SLOTS":
             int remLevelId = Integer.parseInt(parts[1]);
             EnumVehicleSlotType remSlotType = EnumVehicleSlotType.valueOf(parts[2]);
             int numRemove = Integer.parseInt(parts[3]);
             parkingLot.removeSlots(remLevelId, remSlotType, numRemove);
             System.out.println("Removed " + numRemove + " " + remSlotType + " slots from level " + remLevelId + ".");
             break;

         default:
             System.out.println("Invalid command.");
     }
	}
	
    private Vehicle createVehicle(String type, String plate) {
        switch (type.toUpperCase()) {
            case "BIKE": return new Bike(plate);
            case "CAR": return new Car(plate);
            case "BUS": return new Bus(plate);
            default: throw new IllegalArgumentException("Invalid vehicle type.");
        }


}
}
