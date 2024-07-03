package biblioteca;

import java.util.ArrayList;
import java.util.TreeSet;

import pessoa.Membro;

public class Biblioteca implements OperacoesBiblioteca<Membro, Livro> {

	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private TreeSet<Membro> membros = new TreeSet<Membro>();

	@Override
	public void cadastrarMembro(Membro membro) {
		membros.add(membro);
	}

	@Override
	public void cadastrarLivro(Livro livro) {
		livros.add(livro);
	}

	@Override
	public String listarTodosMembros() {
		String listaMembros = "";
		for (Membro membro : membros)
			listaMembros += membro.toString();
		return listaMembros;
	}

	@Override
	public String listarTodosLivros() {
		String listaLivros = "";
		for (Livro livro : livros)
			listaLivros += livro.toString();
		return listaLivros;
	}

	@Override
	public boolean pesquisarMembro(Membro membro) {
		return membros.contains(membro);
	}

	@Override
	public boolean pesquisarLivro(Livro livro) {
		return livros.contains(livro);
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}

	public TreeSet<Membro> getMembros() {
		return membros;
	}

	public void setMembros(TreeSet<Membro> membros) {
		this.membros = membros;
	}

}
