
public class Array {

	public static void main(String[] args) {
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"}; //same data type
		cars[0] = "Mustang";
		//System.out.println(cars[0]);
		String[] car = new String[3];
		
		car[0] = "Camaro";
		car[1] = "Corvette";
		car[2] = "Tesla";
		
		for(int i=0;i<cars.length;i++) {
			System.out.println(cars[i]);
		}
	}

}
