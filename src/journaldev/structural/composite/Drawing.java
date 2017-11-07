package journaldev.structural.composite;

/*
* Composite: Contains groups of leaf objects.
* */

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	public List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		for (Shape shape: shapes ) {
			shape.draw(fillColor);
		}
	}

	//add shape to drawing
	public void add(Shape shape){
		this.shapes.add(shape);
	}

	//removing shape from drawing
	public void remove (Shape shape){
		shapes.remove(shape);
	}

	//remove all shapes
	public void clear(){
		System.out.println("clearing all shapes");
		this.shapes.clear();
	}
}
