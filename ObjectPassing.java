
public class ObjectPassing {

	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Carrr car1 = new Carrr("BMW");
		Carrr car2 = new Carrr("Tesla");
		
		garage.park(car1);
		garage.park(car2);

	}

}
