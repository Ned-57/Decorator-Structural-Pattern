package Decorator;

public class Peas extends PlateDecorator {

	public Peas(Dinner d) {
		super(d);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adds peas");
	}

}
