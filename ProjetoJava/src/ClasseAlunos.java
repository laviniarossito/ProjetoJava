
public class ClasseAlunos {
	String  nomeAt; // Abaixo da class é atributo 
	float notaAt;
	String cursoAt;
	
	// Método para mostrar nome
	public void mostrarNome() {
		System.out.println(this.nomeAt);
	}
	public void mostrarCurso() {
		System.out.println(this.cursoAt);
	}
	public void mostrarNota () {
		System.out.println(this.notaAt);
	}
	
	public void receberNome(String nomePar) {
		this.nomeAt = nomePar;
	}
	public void receberCurso(String cursoPar) {
		this.cursoAt = cursoPar;
	}
	public void receberNota(float notaPar) {
		this.notaAt = notaPar;
	}
}
