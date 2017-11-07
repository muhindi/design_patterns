package journaldev.structural.decorator;

public class TriphopFlavor extends MixtapeDecorator {

	public TriphopFlavor(MixTape mixTape) {
		super(mixTape);
	}

	public String getDescription(){
		return tape.getDescription() + " Adding some triphop...";
	}

	public Double getPrice(){
		return tape.getPrice() + 5.0;
	}

}
