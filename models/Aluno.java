package models;

public class Aluno {
	
	private int matricula;
	private String nome;
	private int idade;
	
	public Aluno(int matricula, String nome, int idade) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setIdade(idade);
	}
	
	@Override
	public boolean equals(Object novo) {
		if(((Aluno) novo).getMatricula() == this.getMatricula())
			return true; //matriculas iguais
		
		return false;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		if(matricula >= 0 && matricula < 10000) //numero de matricula limitado a 10000
			this.matricula = matricula;
		else
			System.out.println("Matricula Invalida.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return String.format("%s\nMatricula: %d\n", this.getNome(), this.getMatricula(), this.getIdade());
	}
	

}
