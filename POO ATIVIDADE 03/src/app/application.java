package app;

import entites.Pessoa;
import entites.Aluno;
import entites.Bolsista;
import entites.Professor;

public class application {


	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		//Scanner scan = new Scanner(System.in);
		p.setIdade(16);
		p.setName("Pedro Sampaio");
		p.setSexo('m');
		
		System.out.println(p);
		
		p.comer();
		
		

	}

}
