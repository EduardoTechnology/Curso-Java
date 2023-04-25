
public class Methods {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		String name = "Bro";
		int age = 23;
		hello(name,age);
		int x = 3;
		int y = 4;
		int z = add(x,y);
		
		
		System.out.println(add(x,y));

	}
	static void hello(String myname, int age) {
		System.out.println("Hello "+myname);
		System.out.println("You are "+age);
	}
	
	static int add(int x,int y) {
		return x + y;
		
		
		
	}

}
