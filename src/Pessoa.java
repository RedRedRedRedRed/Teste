import java.util.Random;


public class Pessoa {

	public String nome;
	public int qtd = 0;
	
	
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}


	public void presentear(){
		
		qtd++;
		
		switch (qtd){
		
		case 1:
			System.out.println("Presente 1 dado");
			break;
		case 2:
			System.out.println("Presente 2 dado");
			break;
		case 3:
			System.out.println("Presente 3 dado");
			break;
			
			default:
				System.out.println("Nada acontece");
				break;
		
		}
		
	}
	
	
	public void avaliar(){
		
		Random r = new Random();
		
		if(r.nextBoolean()){
			System.out.println(nome + " gostou do presente");
		}
		
	}
	
	
}
