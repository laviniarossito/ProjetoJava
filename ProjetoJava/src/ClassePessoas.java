
public class ClassePessoas {
	
	// Atributo: Sempre em baixo da class
	String nomeAt;
	int idadeAt;
	
	// Construtor, toda vez que instanciar um objeto é preciso passar o nome e a idade
	public ClassePessoas(String n, int i) {
		this.nomeAt = n;
		this.idadeAt = i;
	}
	
	public ClassePessoas() {
		// Criado para quando ao passar, estar em branco
	}
	
	// Métodos
	public void receberNome(String name) {
		this.nomeAt = name;
	}
	
	public void receberIdade(int age) {
		this.idadeAt = age;
	}

}
