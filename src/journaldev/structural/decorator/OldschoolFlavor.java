package journaldev.structural.decorator;

public class OldschoolFlavor extends MixtapeDecorator{

	public OldschoolFlavor(MixTape mixTape) {
		super(mixTape);
	}

	public String getDescription(){
		return tape.getDescription() + " with oldschool...";
	}

	public Double getPrice(){
		return tape.getPrice() + 2.0;
	}

}
