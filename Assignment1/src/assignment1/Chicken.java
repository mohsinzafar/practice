package assignment1;

public class Chicken extends PizzaDecorator {
	public Chicken(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + Chicken (10.8) "; 
		}
		public double getPrice() {
	
			return decoratedPizza.getPrice() +10.8;
		}
}
