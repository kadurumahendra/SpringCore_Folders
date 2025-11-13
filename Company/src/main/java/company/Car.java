package company;


public class Car {
	
	private String engineNumber;
	private String engineType;
	private int horsePower;
	
	public Car() {
		super();
	}

	public String getEngineNumber() {
		return engineNumber;
	}

	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Car [engineNumber=" + engineNumber + ", engineType=" + engineType + ", horsePower=" + horsePower + "]";
	}
	
	
	

}
