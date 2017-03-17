import java.util.ArrayList;
public class Audition {

	public static void main(String[] args) {

		int unionID = 400;
		ArrayList<Performer> performers = new ArrayList<Performer>(4);
		ArrayList<Dancer> dancers = new ArrayList<Dancer>(2);

		for (int i = 0; i < 4; i++) {
			Performer performer = new Performer(++unionID);
			performers.add(performer);
			performer.DisplayPerformerID();
		}

		for (int i = 0; i < 2; i++) {
			Dancer dancer = new Dancer(++unionID);
			dancers.add(dancer);
			dancer.displayDancer();
		}

		Vocalist vocalist = new Vocalist(++unionID);
		vocalist.displayVocalist("5");

	}

}
