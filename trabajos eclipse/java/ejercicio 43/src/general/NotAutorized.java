package general;
import java.util.MissingFormatArgumentException;

public class NotAutorized {

	public void No() {
		String text="los nombres introduzidos no coinciden";
		throw new MissingFormatArgumentException(text);
	}
}
