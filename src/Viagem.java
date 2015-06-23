import java.util.ArrayList;
import java.util.List;


public class Viagem {


	public static void main (String args[]){

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Leandro());
		pessoas.add(new Joao());
		pessoas.add(new Larissa());
		
		
		System.out.println("Teste");


		acao(pessoas.get(0), pessoas);
		acao(pessoas.get(1), pessoas);
		acao(pessoas.get(2), pessoas);
		
	}

	public static void acao(Pessoa p, List<Pessoa> pessoas){
		while(p.qtd < 3)
		{
						
			p.presentear(pessoas);
		}
	}
}

