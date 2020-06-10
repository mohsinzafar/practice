package assignment1;

public class NonVegPizza implements Pizza {
public String getDesc() {
	String desc=" NonVegPizza ("+ getPrice() + ")";
	
	return desc;
}
public double getPrice() {
	double price=350;
	
	return price;
}
}
