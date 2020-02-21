
public class VirtualKid {

	public static void main(String[] args) {

	}

	private String getName;
	private String getDescription;
	private String getAge;
	int getHunger = ((int) (Math.random() * 10 + 1));
	int getBoredom = ((int) (Math.random() * 10 + 1));
	int tick;
	int playEverett;
	int feedEverett;

	private String getName() {
		return this.getName = "Everett";

	}

	public String getDescription() {
		return this.getDescription = "I am a rambunctious, free spirited child that's as tall as a 7 year old.";
	}

	public String getAge() {
		return this.getAge = "five years old. ";
	}

	public int getHunger() {
		return this.getHunger;
	}

	public int getBoredom() {
		return this.getBoredom;
	}

	public VirtualKid(int hunger, int boredom) {
		this.getHunger = getHunger;
		this.getBoredom = getBoredom;
	}

	public void feedEverett() {
		this.getBoredom = getBoredom--;
		this.getHunger = getHunger++;
	}

	public void playEverett() {
		this.getBoredom = getBoredom++;
		this.getHunger = getHunger--;
	}

	public void tick() {
		getHunger++;
		getBoredom--;

	}
}
