package assignment1;

public class RomaTomatoes extends PizzaDecorator {
	public RomaTomatoes(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
			
			return decoratedPizza.getDesc() + " + RomaTomatoes (5.20) "; 
		}
		public double getPrice() {
			
			return decoratedPizza.getPrice() + 5.20;
		}
}
