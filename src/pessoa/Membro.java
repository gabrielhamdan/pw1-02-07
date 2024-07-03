package pessoa;

import java.util.Objects;

public class Membro implements Comparable<Membro> {

	private String matricula;
	private SituacaoMembro situacao;
	private String nome;

	public Membro(String matricula, SituacaoMembro situacao, String nome) {
		super();
		this.matricula = matricula;
		this.situacao = situacao;
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membro other = (Membro) obj;
		return Objects.equals(matricula, other.matricula);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public SituacaoMembro getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoMembro situacao) {
		this.situacao = situacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return String.format("Membro: %s\nSituação: %s\nMatrícula: %s\n", nome, situacao.getDesCit(), matricula);
	}

	@Override
	public int compareTo(Membro membro) {
		return matricula.compareTo(membro.getMatricula());
	}

}
