
public class ClassePrincipal {
	
	// M�todo chamado main
	public static void main(String[] args) {
		
		// Usar ClasseAlunos
		ClasseAlunos laviniaObj = new ClasseAlunos(); // Criei um objeto ou instanciei ClassePessoa
		ClasseAlunos muriloObj = new ClasseAlunos(); 

		laviniaObj.nomeAt = "Lavínia";
		laviniaObj.cursoAt = "Informática";
		laviniaObj.notaAt = 9.5F; // Obrigatório uso do "f" na frente do número, devido a casa decimal
		
		System.out.println(laviniaObj.nomeAt); // sysout, CTRL + SPACE
		System.out.println(laviniaObj.cursoAt);
		System.out.println(laviniaObj.notaAt);
	}

}
