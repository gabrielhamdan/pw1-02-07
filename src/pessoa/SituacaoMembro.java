package pessoa;

public enum SituacaoMembro {

	MATRICULADO(1, "matriculado"),
	CANCELADO(2, "cancelado");
	
	private int codSit;
	private String desCit;
	
	SituacaoMembro(int codSit, String desCit) {
		this.codSit = codSit;
		this.desCit = desCit;
	}

	public int getCodSit() {
		return codSit;
	}

	public String getDesCit() {
		return desCit;
	}
	
}
