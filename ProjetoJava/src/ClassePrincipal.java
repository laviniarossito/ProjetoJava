
public class ClassePrincipal {
	
	// M�todo chamado main
	public static void main(String[] args) {
		
		// Usar ClasseAlunos
		ClasseAlunos laviniaObj = new ClasseAlunos(); // Criei um objeto ou instanciei ClassePessoa
		ClasseAlunos muriloObj = new ClasseAlunos(); 

		// Funciona mas está errado
		laviniaObj.nomeAt = "Lavínia";
		laviniaObj.cursoAt = "Informática";
		laviniaObj.notaAt = 9.5F; // Obrigatório uso do "f" na frente do número, devido a casa decimal
		
		// Funciona, mas está errado
		// System.out.println(laviniaObj.nomeAt); // sysout, CTRL + SPACE
		laviniaObj.mostrarNome();
		// System.out.println(laviniaObj.cursoAt);
		laviniaObj.mostrarCurso();
		// System.out.println(laviniaObj.notaAt);
		laviniaObj.mostrarNota();
	}

}
