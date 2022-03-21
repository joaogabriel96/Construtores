package entites;

public class Pessoa {
	
	private String name;
	private int idade;
	private char sexo;
	
	public void comer() {
		System.out.print("comendo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char m) {
		this.sexo = m;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
