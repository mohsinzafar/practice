package assignment1;

public class GreenOlives extends PizzaDecorator {
	public GreenOlives(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + GreenOlives (5.47) "; 
		}
		public double getPrice() {
		
			return decoratedPizza.getPrice() +5.47;
		}
}
