package main;

import models.Aluno;
import models.TabelaHash;

public class Main {

	public static void main(String[] args) {
		
		Aluno a = new Aluno(9000, "nathalie", 28);
		Aluno a1 = new Aluno(9, "bily", 28);

		TabelaHash tabelaAlunos = new TabelaHash();
		
		tabelaAlunos.inserirAluno(a);
		tabelaAlunos.inserirAluno(a1);

		tabelaAlunos.exibirAlunos();
		
	}

}
