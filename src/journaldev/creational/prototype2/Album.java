package journaldev.creational.prototype2;

public class Album extends MediaType implements PrototypeCapable{

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.printf("Cloning Show instance ...");
		return (Album)super.clone(); //shallow copy used
	}

	@Override
	public String toString() {
		return "Album{" +
				"name='" + name + '\'' +
				'}';
	}
}
