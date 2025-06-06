
public class ClasseAlunos extends ClassePessoas{ // extends = herança
	
	// Atributo 
	float notaAt;
	String cursoAt;
	
	// Construtor
	public ClasseAlunos(String name, int age, int grade, String course) {
		super(name, age);
		this.notaAt = grade;
		this.cursoAt = course;
	}
	
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
