public class Performer {
	private final String unionID;

	// constructor
	public Performer(int unionID) {
		this.unionID = String.format("ID-%s", unionID);
	}

	/*% why do you need two getUnionId()? %*/
	public String getUnionID() {
		return unionID;
	}

	public String getunionID() {
		return this.unionID;
	}
	
	/*% Use the camel case naming convention when naming methods %*/
	public void DisplayPerformerID() {
		System.out.printf("%s - %s%n", this.unionID, "performer");
	}
}
