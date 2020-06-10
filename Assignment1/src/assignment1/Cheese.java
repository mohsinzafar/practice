package assignment1;

public class Cheese extends PizzaDecorator {
	public Cheese(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {

			return decoratedPizza.getDesc() + " + Cheese (20.72) "; 
		}
		public double getPrice() {
	
			return decoratedPizza.getPrice() +20.72;
			}
}
