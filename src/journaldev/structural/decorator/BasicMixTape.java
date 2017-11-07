package journaldev.structural.decorator;

public class BasicMixTape implements MixTape {

	@Override
	public String getDescription() {
		return "Playing BasicMixTape...";
	}

	@Override
	public Double getPrice() {
		return 10.00;
	}
}
