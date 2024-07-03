package app;

import javax.swing.JOptionPane;

import biblioteca.Biblioteca;
import biblioteca.Livro;
import pessoa.Membro;
import pessoa.SituacaoMembro;

public class Teste {
	
	static Biblioteca biblioteca = new Biblioteca();

	public static void main(String[] args) {
		while(true) {
			String op = JOptionPane.showInputDialog(null, "1. Cadastrar membro\n2. Cadastrar livro");
			
			if(op == null) continue;
			
			if(op.equals("1"))
				cadastraMembro();
			
			if(op.equals("2"))
				cadastraLivro();
			
			if(op.equals("3"))
				JOptionPane.showMessageDialog(null, biblioteca.listarTodosMembros());;
			
			if(op.equals("4"))
				JOptionPane.showMessageDialog(null, biblioteca.listarTodosLivros());
			
			if(op.equals("5"))
				;
			
			if(op.equals("6"))
				;
			
			if(op.equals("sair"))
				break;
		}
	}

	private static void cadastraMembro() {
		String nome = JOptionPane.showInputDialog(null, "Digite o nome do membro: ");
		String matricula = JOptionPane.showInputDialog(null, "Digite a matrícula do membro: ");
		biblioteca.cadastrarMembro(new Membro(matricula, SituacaoMembro.MATRICULADO, nome));
	}

	private static void cadastraLivro() {
		String titulo = JOptionPane.showInputDialog(null, "Digite o título do livro: ");
		String autor = JOptionPane.showInputDialog(null, "Digite o nome do autor: ");
		String isbn = JOptionPane.showInputDialog(null, "Digite o ISBN: ");
		biblioteca.cadastrarLivro(new Livro(titulo, autor, isbn));
	}

}
