package journaldev.structural.composite;

public class CompositeClient {

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape triangle2 = new Triangle();
		Shape circle = new Circle();

		Drawing drawing = new Drawing();
		drawing.add(triangle);
		drawing.add(triangle2);
		drawing.add(circle);

		drawing.draw("Red");
		System.out.print("\n");
		drawing.clear();
		System.out.print("\n");
		drawing.add(triangle);
		drawing.add(circle);
		drawing.draw("Green");

	}

}
