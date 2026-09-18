package iterator;

public class DispositivoCasa {
	
	private String nome;
	private String comodo;
	
	public DispositivoCasa(String nome, String comodo) {
		this.nome = nome;
		this.comodo = comodo;
	}

	public String getNome() {
		return nome;
	}

	public String getComodo() {
		return comodo;
	}

	@Override
	public String toString() {
		return nome + " - " + comodo;
	}
	
	

}
