package journaldev.creational.prototype2;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

	public static class ModelType {

		public static final String MOVIE = "movie";

		public static final String ALBUM = "album";

		public static final String SHOW = "show";
	}

	/*static Hash map to store object instances */
	public static Map<String, PrototypeCapable> protoTypes =
			new HashMap<>();

	/*static block stores instance references*/
	static {
		protoTypes.put(ModelType.ALBUM, new Album());
		protoTypes.put(ModelType.MOVIE, new Movie());
		protoTypes.put(ModelType.SHOW, new Show());
	}

	/*static method to get a required reference from the map*/
	public static PrototypeCapable getInstance(String name) throws CloneNotSupportedException {
		return (protoTypes.get(name)).clone();
	}

}
