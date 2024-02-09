import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	private static ArrayList<Cat> catList = new ArrayList<Cat>();
	private static boolean[] catSpaceAvailable = Cat.catSpaceAvailable;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		


		char input;
		
		do {
			displayMenu();
			input = scanner.next().charAt(0);
			
			// Clear scanner
			scanner.nextLine();
			
			switch (input) {
			case '1': 
				checkInDog(scanner);
				break;
			case '2': 
				checkInCat(scanner);
				break;
			case '3': 
				checkOutDog(scanner);
				break;
			case '4': 
				checkOutCat(scanner);
				break;
			case 'q': 
				System.out.println("Application terminated\nGoodbye");
				break;
			default : 
				System.out.println("Please enter a valid command");
				break;
			}
		} while (input != 'q');

	}
	
	public static void displayMenu() {
		System.out.println("\n\n");
		System.out.println("\t\t\tPet Boarding and Grooming");
		System.out.println("[1] Check in a dog");
		System.out.println("[2] Check in a cat");
		System.out.println("[3] Check out a dog");
		System.out.println("[4] Check out a cat");
		System.out.println("[q] Quit application");
		System.out.println();
		System.out.println("Enter a menu selection");
	}
	
	public static void checkInDog(Scanner scanner) {
		System.out.println("What is the dogs name?");
		String name = scanner.nextLine();
		System.out.println(name + " has been checked in.");
		System.out.println("Press Enter to return to the menu.");
		scanner.nextLine();
	}
	
	public static void checkInCat(Scanner scanner) {
		System.out.println("What is the cats name?");
		String name = scanner.nextLine();
		System.out.println("How old is " + name + "?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("How many days will " + name + " be boarding with us?");
		int daysStay = scanner.nextInt();
		scanner.nextLine();
		System.out.println(age + " " + daysStay + " " + Arrays.toString(catSpaceAvailable));
		
		int catSpaceNumber = 0;
		boolean foundAvailable = false;
		
		for(int i = 0; i < catSpaceAvailable.length; i++) {
			if (catSpaceAvailable[i]) {
				catSpaceNumber = i + 1;
				catSpaceAvailable[i] = false;
				foundAvailable = true;
				break;
			}
		}
		
		if (foundAvailable) {
		Cat newCat = new Cat(name, age, daysStay, catSpaceNumber);
		catList.add(newCat);
		System.out.println(newCat);
		} else {
			System.out.println("No available cat spaces.");
		}
		
		System.out.println("Press Enter to return to the menu.");
		scanner.nextLine();
	}
	
	public static void checkOutDog(Scanner scanner) {
		System.out.println("This method still needs work.");
		System.out.println("Press Enter to return to the menu.");
		scanner.nextLine();
	}
	
	public static void checkOutCat(Scanner scanner) {
		System.out.println("This method still needs work.");
		System.out.println("Press Enter to return to the menu.");
		scanner.nextLine();
	}

}
