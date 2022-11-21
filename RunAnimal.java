import java.util.Scanner;

public class RunAnimal{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose an animal. Press B for bird, C for Cat, D for Dog: ");
		String x = sc.nextLine();
		
		if(x.equalsIgnoreCase("B")){
			Bird obj = new Bird();
			obj.eat();
			obj.sleep();
			obj.makeSound();
		}
		
		else if(x.equalsIgnoreCase("C")){
			Cat obj1 = new Cat();
			obj1.eat();
			obj1.sleep();
			obj1.makeSound();
		}
		
		else if(x.equalsIgnoreCase("D")){
			Dog obj2 = new Dog();
			obj2.eat();
			obj2.sleep();
			obj2.makeSound();
		}
		
		else{
			System.out.println("Invalid input.");
		}
	}
}