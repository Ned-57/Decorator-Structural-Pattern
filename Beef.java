package Decorator;

//Subclass of Base Decorator (Concrete Decorator)
public class Beef extends PlateDecorator {

	public Beef(Dinner d) {
		super(d);
	}

	@Override
	public void assemble() {
		// Calls the parent method
		super.assemble();
		// Adds behaviour
		System.out.println("Add beef");
	}

}
