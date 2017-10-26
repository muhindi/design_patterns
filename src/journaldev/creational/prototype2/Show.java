package journaldev.creational.prototype2;

public class Show extends MediaType implements PrototypeCapable{

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.printf("Cloning Show instance ...");
		return (Show)super.clone(); //shallow copy used


	}

	@Override
	public String toString() {
		return "Show{" +
				"name='" + name + '\'' +
				'}';
	}
}
