
import java.util.Random;

public class Dancer extends Performer {
	private String style;
	private Random random = new Random();

	// enum
	private enum Styles {
		TAP, SALSA, HIPHOP, JAZZ
	};

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public Dancer(int unionID) {
		super(unionID);
		int nextInt = random.nextInt(3);
		switch (nextInt) {
		case 0:
 {
			style = String.format("%s", Styles.TAP);
			break;
		}
		case 1:
 {
			style = String.format("%s", Styles.SALSA);
			break;
		}
		case 2:
 {
			style = String.format("%s", Styles.HIPHOP);

			break;
		}
		case 3:
 {
			style = String.format("%s", Styles.JAZZ);
			break;
		}
		}
	}

	public void displayDancer() {
		System.out.printf("%s -%s - %s%n", this.style, getunionID(),
				"dancer");
	}
}
