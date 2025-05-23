
public class ClassePrincipal {
	
	// Método chamado main
	public static void main(String[] args) {
		
		String nome = "Lavinia";
		System.out.println("Hello World, " + nome + "!"); // sysout, CTRL + SPACE

		// Usar ClassePessoas
		ClassePessoas alunoObj = new ClassePessoas(); // Criei um objeto ou instanciei ClassePessoa
		
		alunoObj.nomeAt = "Lavinia";
		alunoObj.rendaAt = 15_000;
		
		System.out.println(alunoObj.nomeAt);
		System.out.println(alunoObj.rendaAt);

	}

}
