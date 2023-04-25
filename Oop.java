
public class Oop {

	public static void main(String[] args) {
		//object = an instance of a class that may contain attributes and methods
		//example: (phone,desk,computer,coffee cup)
		Car myCar = new Car(); //Summon Car with attributes and methods
		System.out.println(myCar.model); //Accessing the attribute of the object
		System.out.println(myCar.make);
		myCar.drive(); //Accessing the method
		myCar.brake(); //Accessing the method
		
		Car myCar2 = new Car();
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
	}

}
