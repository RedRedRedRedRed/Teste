import java.util.List;
import java.util.Random;


public class Pessoa {

	public String nome;
	public String presenteado;
	public int qtd = 0;
	public int like = 0;
	public int dislike = 0;


	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}



	public void presentear(List<Pessoa> pessoas){

		Random i = new Random();
		int a = i.nextInt(pessoas.size()-1);


		qtd++;
		switch (qtd){

		case 1:
			System.out.println(nome + " deu o presente 1 para " + pessoas.get(a).getNome());
			break;
		case 2:
			System.out.println(nome + " deu o presente 2 para " + pessoas.get(a).getNome());
			break;
		case 3:
			System.out.println(nome + " deu o presente 3 para " + pessoas.get(a).getNome());
			break;

		default:
			System.out.println(nome + " nao fez nada");
			break;

		}

		pessoas.get(a).avaliar();

	}


	private String getNome() {

		return nome;
	}



	public void avaliar(){

		Random r = new Random();

		if(r.nextBoolean()){
			like++;
			System.out.println(nome + " gostou do presente");
		} else {
			dislike--;
			System.out.println(nome + " nao gostou do presente");
		}
		
		if(dislike > 3){
			System.out.println(nome + " vai matar");
		}else{}
		if(like > 3){
			System.out.println(nome + " vai reviver");
		}else{}
		
	}
}
