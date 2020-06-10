package assignment1;

public class VegPizza implements Pizza{
	public String getDesc() {
		String desc=" VegPizza (" + getPrice() + ")";
		return desc;
	}
	public double getPrice() {
		double price=230;
		System.out.println();
		return price;
	}
}
