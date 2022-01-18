package Decorator;

//Subclass of Base Decorator (Concrete Decorator)
public class Rice extends PlateDecorator {

	public Rice(Dinner d) {
		super(d);
	}

	@Override
	public void assemble() {
		// Calls the parent method
		super.assemble();
		// Adds behaviour
		System.out.println("Adds rice");
	}

}
