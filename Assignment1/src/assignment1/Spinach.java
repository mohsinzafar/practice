package assignment1;

public class Spinach extends PizzaDecorator {
	public Spinach(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + Spinach (7.92) "; 
		}
		public double getPrice() {
		
			return decoratedPizza.getPrice() + 7.92;
		}
}
