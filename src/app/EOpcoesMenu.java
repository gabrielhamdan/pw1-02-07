package app;

public enum EOpcoesMenu {

	CADASTRA_MEMBRO(1, "Cadastrar membro"),
	CADASTRA_LIVRO(2, "Cadastrar livro"),
	LISTAR_MEMBROS(3, "Listar membros"),
	LISTAR_LIVROS(4, "Listar livros"),
	PESQUISAR_MEMBRO(5, "Pesquisar membro"),
	PESQUISAR_LIVRO(6, "Pesquisar livro"),
	SAIR(7, "Sair");
	
	private int op;
	private String desc;
	
	EOpcoesMenu(int op, String desc) {
		this.op = op;
		this.desc = desc;
	}

	public int getOp() {
		return op;
	}

	public String getDesc() {
		return desc;
	}
	
}
