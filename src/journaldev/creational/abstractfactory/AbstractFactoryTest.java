package journaldev.creational.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		testPattern();
	}

	public static void testPattern(){
		Computer computer1 =
				ComputerFactory.getComputer(new PCFactory("16Gb","500Gb","2.66Ghz"));

		Computer computer2 =
				ComputerFactory.getComputer(new ServerFactory("1286Gb","5Tb","2.66Ghz"));

		System.out.println(computer1.toString());
		System.out.println(computer2.toString());
	}
}
