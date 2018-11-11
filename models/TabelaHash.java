package models;

import java.util.LinkedList;

public class TabelaHash {
	
	private LinkedList<Aluno>[] tabelaHash;
	
	public TabelaHash() {
		this.tabelaHash = new LinkedList[11];
		
		for(int i = 0; i < tabelaHash.length; i++) {
			tabelaHash[i] = new LinkedList<Aluno>();
		}
	}
	
	public void inserirAluno(Aluno novo) {
		if(matriculaExistente(novo)) {
			System.out.println("Matricula já cadastrada.\n");
			return;
		} else {
			int indx = novo.getMatricula() % 11;
			tabelaHash[indx].add(novo);
			System.out.printf("Aluno cadastrado.\n");
		}
	}
	
	public boolean matriculaExistente(Aluno novo) {
		for(int i = 0; i < tabelaHash.length; i++) {
			if(tabelaHash[i].contains(novo))
				return true;
		}
		return false;
	}
	
	public void exibirAlunos() {
		System.out.printf("\n\t---- Alunos cadastrados: ----\n\n");
		for(int i = 0; i < tabelaHash.length; i++) {
			for(Aluno o : tabelaHash[i]) 
				System.out.println(o.toString());
		}
	}

}
