
public class Helper_Tool {

	public static void checkHealth(Pet myPet) {
			if (myPet.getHealth() < 5) { //check if health is below 5
				int randomNum = (int) (Math.random() * 2) +1;
					if (randomNum == 1) {
						myPet.decreaseCleanliness(myPet.getCleanliness()); //decrease cleanliness
						System.out.println(myPet.getName() + " is looking dirty, he needs a bath. (-1 Cleanliness)");
					} else {
						myPet.decreaseHappiness(myPet.getHappiness()); //decrease happiness
						System.out.println(myPet.getName() + " is sad, he needs someone to play with. (-1 Happiness)");
					}
			}
	}
	
	public static void checkHunger(Pet myPet) {
		if (myPet.getHunger() < 5) { //check if hunger is below 5
			int randomNum = (int) (Math.random() * 2) +1;
				if (randomNum == 1) {
					myPet.decreaseHappiness(myPet.getHappiness()); //decrease happiness
					System.out.println(myPet.getName() + " is not having a good time. Consider taking him to the park. (-1 Happiness)");
				} else {
					myPet.decreaseHealth(myPet.getHealth()); //decrease health
					System.out.println(myPet.getName() + " is getting very weak. (-1 Health)");
				}
		}
	}
	
	public static void checkHappiness(Pet myPet) {
		if (myPet.getHappiness() < 5) { //check if happiness is below 5
			int randomNum = (int) (Math.random() * 2) +1;
				if (randomNum == 1) {
					myPet.decreaseHealth(myPet.getHealth()); //decrease health
					System.out.println(myPet.getName() + " is turning blue, he needs to see a doctor. (-1 Health)");
				} else {
					myPet.decreaseHunger(myPet.getHunger()); //decrease hunger
					System.out.println(myPet.getName() + " has gone too long without a mouse. (-1 Hunger)");
				}
		}
	}
	
	public static void checkCleanliness(Pet myPet) {
		if (myPet.getCleanliness() < 5) { //check if cleanliness is below 5
			int randomNum = (int) (Math.random() * 2) +1;
				if (randomNum == 1) {
					myPet.decreaseHunger(myPet.getHunger()); //decrease hunger
					System.out.println(myPet.getName() + " is looking very skinny. (-1 Hunger)");
				} else {
					myPet.decreaseCleanliness(myPet.getCleanliness()); //decrease cleanliness
					System.out.println(myPet.getName() + "'s scales are looking dull. (-1 Cleanliness)");
				}
		}
	}
}
