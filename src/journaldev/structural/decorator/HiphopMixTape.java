package journaldev.structural.decorator;

public class HiphopMixTape implements MixTape{

	@Override
	public String getDescription() {
		return "Playing Hiphop ";
	}

	@Override
	public Double getPrice() {
		return 5.0;
	}
}
