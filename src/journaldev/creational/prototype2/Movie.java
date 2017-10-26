package journaldev.creational.prototype2;

public class Movie extends MediaType implements PrototypeCapable{


	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.printf("Cloning Movie instance ... ");
		return (Movie)super.clone(); //shallow copy used
	}

	@Override
	public String toString() {
		return "Movie{" +
				"name='" + name + '\'' +
				'}';
	}
}
