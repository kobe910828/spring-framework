package source.factory;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2019/8/14 15:29
 */
public class Car {
	private String brand;
	private double price;

	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
