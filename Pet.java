/* Brandon Papin
 * CS 223j
 * 9/20/19
 * Create a virtual pet with characteristics that you can change
 */

public class Pet {

	private String name;
	private int hunger;
	private int cleanliness;
	private int happiness;
	private int health;
	private int age;
	
	//constructor
	public Pet(String name) {
		this.name =      name;
		//generate a random number between 1-10 
		hunger =        (int) (Math.random() * 10) +1;
		cleanliness =   (int) (Math.random() * 10) +1;
		happiness =     (int) (Math.random() * 10) +1;
		health =        (int) (Math.random() * 10) +1;
		age =           0;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public int getHunger() {
		return hunger;
	}
	public int getCleanliness() {
		return cleanliness;
	}
	public int getHappiness() {
		return happiness;
	}
	public int getHealth() {
		return health;
	}
	public int getAge() {
		return age;
	}
	//setters
	public void setHunger(int hunger) {  //increment hunger by 1
		this.hunger = hunger + 1;
	}
	public void setCleanliness(int cleanliness) {  //increment cleanliness by 1
		this.cleanliness = cleanliness + 1;
	}
	public void setHappiness(int happiness) {  //increment happiness by 1
		this.happiness = happiness + 1;
	}
	public void setHealth(int health) {  //increment health by 1
		this.health = health + 1;
	}
	public void setAge(int age) {  //increment age by 1
		this.age = age + 1;
	}
	public void decreaseHappiness(int happiness) { //decrement happiness by 1
		this.happiness = happiness - 1;
	}
	public void decreaseCleanliness(int cleanliness) { //decrement cleanliness by 1
		this.cleanliness = cleanliness - 1;
	}
	public void decreaseHealth(int health) { //decrement health by 1
		this.health = health - 1;
	}
	public void decreaseHunger(int hunger) { //decrement hunger by 1
		this.hunger = hunger - 1;
	}
}

