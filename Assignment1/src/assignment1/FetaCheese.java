package assignment1;

public class FetaCheese extends PizzaDecorator {
	public FetaCheese(Pizza decoratedPizza) {
		super(decoratedPizza);
	}
		public String getDesc() {
		
			return decoratedPizza.getDesc() + " + FetaCheese (10.8) "; 
		}
		public double getPrice() {
		
			return decoratedPizza.getPrice() +10.8;
		}
}
