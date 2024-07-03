package biblioteca;

public interface OperacoesBiblioteca<T1, T2> {
	
	public void cadastrarMembro(T1 t1);

	public void cadastrarLivro(T2 t2);

	public String listarTodosMembros();

	public String listarTodosLivros();

	public boolean pesquisarMembro(T1 t1);

	public boolean pesquisarLivro(T2 t2);
	
}
