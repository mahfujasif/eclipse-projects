package constraint1;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
	
	@NotNull
	private String manufacturer;
	
	@NotNull
	@Size(min = 2, max = 14)
	@CheckCase(value = CaseMode.UPPERCASE)
	private String LicensePlate;
	
	@Min(2)
	private int seatcount;
	
	public Car(String manufacturer, String LicensePlate, int seatCount) {
		this.manufacturer = manufacturer;
		this.LicensePlate = LicensePlate;
		this.seatcount = seatCount;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getLicensePlate() {
		return LicensePlate;
	}
	
	public int getSeatCount() {
		return seatcount;
	}

	public int getSeatcount() {
		return seatcount;
	}

	public void setSeatcount(int seatcount) {
		this.seatcount = seatcount;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}
	
	

}
