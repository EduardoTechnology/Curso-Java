
public class Moto {
	String modelo;
	int ano;
    String cor;
    Moto(String modelo,int ano,String cor){
    	this.modelo = modelo;
    	this.ano = ano;
    	this.cor = cor;
    	
    }
    void ligar() {
    	System.out.println("Você ligou a moto");
    }
    void frear() {
    	System.out.println("Você freou a moto");
    }

}
