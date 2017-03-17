public class Audition1 {

	// main method
	public static void main(String[] args) {

		int unionID = 400;
		Performer[] performers = new Performer[7];

		performers[0] = new Performer(++unionID);
		performers[1] = new Performer(++unionID);
		performers[2] = new Performer(++unionID);
		performers[3] = new Performer(++unionID);
		performers[4] = new Dancer(++unionID);
		performers[5] = new Dancer(++unionID);
		performers[6] = new Vocalist(++unionID);

		/*
		 * for (Performer performer : performers) {
		 * performer.DisplayPerformerID(); }
		 */
		for (Performer performer : performers) {
					switch (performer.getClass().getName()) {
			case "Performer": {
				performer.DisplayPerformerID();
				break;
			}
			case "Dancer":
			{
				Dancer dancer = (Dancer) performer;
				dancer.displayDancer();
				break;
			}
		case "Vocalist":
		{
			Vocalist vocalist = (Vocalist) performer;
			vocalist.displayVocalist("5");
			break;
		}
		}
		}

	}
}
