package assignment1;

public class Mutton extends PizzaDecorator {
	public Mutton(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + Mutton (18.12) "; 
		}
		public double getPrice() {
		
			return decoratedPizza.getPrice() +18.12;
		}
}
