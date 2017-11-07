package journaldev.structural.decorator;

public  class ReggaeFlavor extends MixtapeDecorator{

	public ReggaeFlavor(MixTape tape) {
		super(tape);
	}

	@Override
	public String getDescription() {
		return tape.getDescription() + "with Reggae...";
	}

	@Override
	public Double getPrice() {
		return 2.0;
	}
}
