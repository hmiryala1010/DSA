package parkinglot;

public abstract class ParkingSlot { // holds one vehicle //knows which vehicle is inside and if its available
	int id;
	int level;
	boolean isAvailable;
	EnumVehicleSlotType type;
	long entryTime;
	Vehicle vehicle;

	public ParkingSlot(int id, boolean isAvailable, EnumVehicleSlotType type) {
		this.id = id;
		this.isAvailable = true;
		this.type = type;
	}

	boolean canFitVehicle(Vehicle v) {
		return true;

	}

	void park(Vehicle v) {
		this.vehicle = v;
		this.isAvailable = false;
		this.entryTime = System.currentTimeMillis();
	}

	long freeUp() {
		this.vehicle = null;
		long parkedTime = System.currentTimeMillis() - entryTime;
		this.isAvailable = true;
		return parkedTime;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public EnumVehicleSlotType getType() {
		return type;
	}

	public void setType(EnumVehicleSlotType type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

}
