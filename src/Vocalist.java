
import java.util.Random;

public class Vocalist extends Performer {
	private String vocalkey;

	private Random random = new Random();

	// enum
	private enum KEYS {
		G, H, I, J
	};
	
	
	public Vocalist(int unionID) {
		super(unionID);
		int nextInt = random.nextInt(3);
		switch (nextInt) {
		case 0:
 {
			vocalkey = String.format("%s", KEYS.G);
			break;
		}
		case 1:
 {
			vocalkey = String.format("%s", KEYS.H);
			break;
		}
		case 2:
 {
			vocalkey = String.format("%s", KEYS.I);

			break;
		}
		case 3:
 {
			vocalkey = String.format("%s", KEYS.J);
			break;
		}
		}
	}

	public void displayVocalist() {
		System.out.printf("%s - %s %n", "I sing in the key of", getVocalkey(),
				getunionID());
	}

	public void displayVocalist(String volume) {
		System.out.printf("%s - %s - %s %s %s %n", "I sing in the key of",
				getVocalkey(), " at the volume ", volume, getunionID());
	}

	public String getVocalkey() {
		return vocalkey;
	}

	public void setVocalkey(String vocalkey) {
		this.vocalkey = vocalkey;
	}


}
