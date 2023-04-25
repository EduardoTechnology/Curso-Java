
public class Oopteste2 {

	public static void main(String[] args) {
		Moto moto1 = new Moto("Hornet",2008,"Branca");
		Moto moto2 = new Moto("Yamaha",2012,"Azul");
		System.out.println(moto2.modelo);
		System.out.println(moto1.ano);
		moto1.ligar();
		moto2.frear();

	}

}
