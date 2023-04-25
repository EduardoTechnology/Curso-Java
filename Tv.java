
public class Tv {
	String marca;
	int polegadas;
	String cor;
	Tv(String marca,int polegadas,String cor){
		this.marca = marca;
		this.polegadas = polegadas;
		this.cor = cor;
		
	}
	void ligar(){
		System.out.println("A tv foi ligada");
	}
	void mudar() {
		System.out.println("Você mudou de canal");
	}

}
