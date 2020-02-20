
public class VirtualKid {

	public static void main(String[] args) {

	}

	private String name;
	private String description;
	private int age;
	private int hunger = 6;
	private int boredom = 5;

	public String name() {
		return "";

	}

	public String description() {
		return "";
	}

	public int age() {
		return age;
	}

	public void feed() {
		this.hunger ++;
	}

	public void boredom() {
		this.boredom ++;
	}

}
