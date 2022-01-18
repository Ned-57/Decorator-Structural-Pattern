package Decorator;

public class Runner {

	public static void main(String[] args) {

		Dinner plate1 = new Peas(new Rice(new Beef(new Plate())));

		plate1.assemble();

	}

}
