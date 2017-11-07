package journaldev.structural.decorator;

public class TestMixtapeDemo {

	public static void main(String[] args) {
		MixTape oldschoolMix  = new OldschoolFlavor(new BasicMixTape());
		System.out.println(oldschoolMix.getDescription());
		MixTape reggaeMix = new ReggaeFlavor(new BasicMixTape());
		System.out.println(reggaeMix.getDescription());
		MixTape allMix = new ReggaeFlavor(new OldschoolFlavor(new BasicMixTape()));
		System.out.println(allMix.getDescription());

	}
}
