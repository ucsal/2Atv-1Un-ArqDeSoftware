package decorator;

public class GeladeiraInteligente implements Dispositivo {

	private String nome;

	public GeladeiraInteligente(String nome) {
		this.nome = nome;
	}

	@Override
	public void ligar() {
		System.out.println(nome + " foi ligado");
	}

	@Override
	public void desligar() {
		System.out.println(nome + " foi desligada");
	}

	@Override
	public String getDescricao() {
		return nome;
	}

}
