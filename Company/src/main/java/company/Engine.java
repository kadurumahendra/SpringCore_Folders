package company;

public class Engine {
	
	private String carName;
	private String carModel;
	private String price;
	private Car car;
	public Engine() {
		super();
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Engine [carName=" + carName + ", carModel=" + carModel + ", price=" + price + ", car=" + car + "]";
	}
	
	
	

}
