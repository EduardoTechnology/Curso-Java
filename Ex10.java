
public class Ex10 {

	public static void main(String[] args) {
		int salario = 500;
		double reajuste1 = salario*1.30;
		double reajuste2 = salario*1.50;
		if (salario>300) {
			System.out.println(reajuste1);
			
		}
		else if(salario<300) {
			System.out.println(reajuste2);
		}

	}

}
