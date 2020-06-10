package assignment1;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza decoratedPizza;
	public PizzaDecorator(Pizza decoratedPizza) {
		this.decoratedPizza=decoratedPizza;
	}
}
