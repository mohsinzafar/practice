package assignment1;

public class RedOnions extends PizzaDecorator {
	public RedOnions(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + RedOnions (10.8) "; 
		}
		public double getPrice() {

			return decoratedPizza.getPrice() +10.8;
		}
}
