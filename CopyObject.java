
public class CopyObject {

	public static void main(String[] args) {
		CarCopy car1 = new CarCopy("Chevrolet","Camaro",2021);
		//CarCopy car2 = new CarCopy("Ford","Mustang",2022);
		CarCopy car2 = new CarCopy(car1);
		
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());

	}

}
