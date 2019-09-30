import java.util.Scanner;

public class driver {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		//print intro
		System.out.println("-Virtual Snake-");
		System.out.println("                  __\n" + 
				"      _______    /*_>-<\n" + 
				"  ___/ _____ \\__/ /\n" + 
				" <____/     \\____/\n");
		System.out.println("Please enter a name for your pet snake: ");
		String name = myObj.nextLine();
		Pet snake = new Pet(name);
		System.out.println(name + " was born!");
		System.out.println("Initializing Stats...");
		
		//set up loop
		boolean loop = true;
		while (loop) {
		
		printStats(snake); //print stats of object snake
		menu();       //display the menu
		
		checkAttributes(snake);
		
		int choice = myObj.nextInt(); //input user choice
			if (choice == 1) {
				int random = (int) (Math.random() * 2) +1; //generate random # to determine which phrase is said
				snake.setHunger(snake.getHunger()); //increment hunger by 1
				if (random == 1) {
					System.out.println(name + " wriggles with joy as you offer a mouse. (+1 Hunger)");
				} else {
					System.out.println(name + " is thankful for this juicy lizard. (+1 Hunger)");
				}
			} else if (choice == 2) {
				int random = (int) (Math.random() * 2) +1; //generate random # to determine which phrase is said
				snake.setCleanliness(snake.getCleanliness()); //increment cleanliness by 1
				if (random == 1) {
					System.out.println(name + " slicks his scales back and straightens his tail. (+1 Cleanliness)");
				} else {
					System.out.println(name + " sheds his skin to reveal a shiny new layer. (+1 Cleanliness)");
				}
			} else if (choice == 3) {
				int random = (int) (Math.random() * 2) +1; //generate random # to determine which phrase is said
				snake.setHappiness(snake.getHappiness()); //increment happiness by 1
				
				System.out.println("You pet " + name);
				
				if (random == 1) {
					System.out.println(name + " coils in fear and slithers away. (+1 Happiness)");
				} else {
					System.out.println(name + " accepts the pet and licks your hand. (+1 Happiness)");
				} 
			} else if (choice == 4) {
				int random = (int) (Math.random() * 2) +1; //generate random # to determine which phrase is said
				snake.setHealth(snake.getHealth()); //increment health by 1
				if (random == 1) {
					System.out.println(name + " goes out for a 'walk'. (+1 Health)");
				} else {
					System.out.println(name + " digs down deep in the dirt. (+1 Health)");
				} 
			} else if (choice == 5) {
				System.out.println("You have chosen to quit.");
				loop = false;
			}
			
			snake.setAge(snake.getAge()); //increment the age by 1 every loop
			
			if ((snake.getAge()) == 9) {
				System.out.println(name + " died of old age :( ");
				loop = false;
			}
			if (isZero(snake) == false) {
				System.out.println("Insufficient stat: " + name + " has died.");
				loop = false;
			}
		}
	}
	//display object stats
	public static void printStats(Pet snake) {
		System.out.println("-" + snake.getName() + "'s Stats-");
		System.out.println("Hunger: " + snake.getHunger());
		System.out.println("Cleanliness: " + snake.getCleanliness());
		System.out.println("Happiness: " + snake.getHappiness());
		System.out.println("Health: " + snake.getHealth());
		System.out.println("Age: " + snake.getAge());
	}
	//display menu
	private static void menu() {
		System.out.println("Main Menu: \n1. Feed \n2. Wash \n3. Play \n4. Health \n5. -Quit- \nEnter a number (1-5)");
	}
	
	//check if any characteristics are below 5
	public static void checkAttributes(Pet snake) {
		Helper_Tool.checkCleanliness(snake);
		Helper_Tool.checkHappiness(snake);
		Helper_Tool.checkHealth(snake);
		Helper_Tool.checkHunger(snake);
	}
	
	//check if any characteristic is zero or below. If so, end loop
	public static boolean isZero(Pet snake) {
		if ((snake.getHunger() <= 0) || (snake.getHealth() <= 0) || (snake.getCleanliness() <= 0) || (snake.getHappiness() <= 0)) {
			return false;
		} else {
			return true;
		}
	}

}
