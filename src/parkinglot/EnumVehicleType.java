package parkinglot;

public enum EnumVehicleType {

	BIKE("bike"), CAR("car"), BUS("bus");

	private final String value;

	EnumVehicleType(String string) {
		this.value = string;

	}

	public String getValue() {
		return value;
	}

}
