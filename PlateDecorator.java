package Decorator;

//Superclass of the decorators (Base Decorator)
public class PlateDecorator implements Dinner {

	// Declaring dinner as a variable
	Dinner dinner;

	// Constructor
	public PlateDecorator(Dinner d) {
		this.dinner = d;
	}

	// Behaviour to be overriden
	public void assemble() {
		this.dinner.assemble();
	}

}
