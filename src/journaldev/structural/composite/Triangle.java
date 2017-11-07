package journaldev.structural.composite;

/*
* Leaf: Implements the base component, multiple leaf objects can be created from the
* base.
* */
public class Triangle implements Shape{

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing triangle with color: "+fillColor);
	}
}
