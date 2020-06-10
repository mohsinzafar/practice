package assignment1;

public class Broccoli extends PizzaDecorator {
	public Broccoli(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
			
			return decoratedPizza.getDesc() + " + Broccoli (9.8) "; 
		}
		public double getPrice() {
		
			return decoratedPizza.getPrice() +9.8;
		}
}
