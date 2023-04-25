
public class ToString {

	public static void main(String[] args) {
		// toString() = special method that all object inherit,
		//              that returns a string that "textually represents" an object
		//              can be used both implicitly and expplicitly
		
		Carr car = new Carr();
		
		System.out.println(car.toString()); //return all the attributes
		System.out.println(car);
		
		
		
		System.out.println(car.make);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.year);

	}

}
