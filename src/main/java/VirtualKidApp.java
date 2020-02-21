import java.util.Scanner;

public class VirtualKidApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualKid everett = new VirtualKid((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 - 1));

		while (true) {
			System.out.println("Hello, my name is Everett! \nI am " + everett.getAge() + everett.getDescription()
					+ "\nMy hunger is at a " + everett.getHunger + "\nMy level of boredom is at a " + everett.getBoredom
					+ "\nWhat would you like to do first?");
			System.out.println("\n1.Feed Everett" + "\n2.Take Everett to playground");

			String optionEntered = input.nextLine();

			if (optionEntered.contentEquals("1")) {
				System.out.println("You fed me an apple!");
				System.out.println("\nHunger = " + everett.getHunger + "\nBoredom = " + everett.getBoredom);
			} else {
				System.out.println("We went to the playground!");
				System.out.println("\nHunger = " + everett.playEverett + "\nBoredom = " + everett.playEverett);

			}
			System.out.println("What do you want to do next?" + "\n1.Feed" + "\n2. Play");
			String optionEntered2 = input.nextLine();

			{
			}
			everett.tick();

			input.close();
		}
	}
}