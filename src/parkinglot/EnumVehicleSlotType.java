package parkinglot;

public enum EnumVehicleSlotType {
	BIKE_SLOT("bike"), CAR_SLOT("car"), BUS_SLOT("bus");

	private final String value;

	EnumVehicleSlotType(String string) {
		this.value = string;

	}

	public String getValue() {
		return value;
	

}
}
