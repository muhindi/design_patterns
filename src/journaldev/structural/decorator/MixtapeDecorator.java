package journaldev.structural.decorator;

public abstract class MixtapeDecorator implements MixTape   {

	protected MixTape tape;

	public MixtapeDecorator (MixTape tape){
		this.tape = tape;
	}

	public String getDescription(){
		return tape.getDescription();
	}

	public Double getPrice(){
		return tape.getPrice();
	}
}

