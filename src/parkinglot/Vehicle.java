package parkinglot;

public abstract class Vehicle { // stores type and license number 
	private EnumVehicleType type;
	private String licensePlate;
	
  
	public Vehicle(EnumVehicleType type, String licensePlate) {
		super();
		this.type = type;
		this.licensePlate = licensePlate;
	}
	
	
	public EnumVehicleType getType() {
		return type;
	}
	public void setType(EnumVehicleType type) {
		this.type = type;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	

}
