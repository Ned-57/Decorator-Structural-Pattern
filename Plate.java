package Decorator;

//Class of objects being wrapped

public class Plate implements Dinner {

	// Basic behaviour which can be altered by wrappers
	public void assemble() {
		System.out.println("Empty plate");
	}

}
