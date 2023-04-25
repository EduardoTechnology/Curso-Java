package package1;
import package2.*;

public class A {
	//protected String protectedMessage = "This is protected"; //It s acessable from different class and package as long that class is extend
    public static void main(String[] args) {
    	B b = new B();
    	System.out.println(b.privateMessage);
    }
}





