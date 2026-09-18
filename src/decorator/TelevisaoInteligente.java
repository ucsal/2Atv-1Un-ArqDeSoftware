package decorator;

public class TelevisaoInteligente implements Dispositivo {

	private String nome;

	public TelevisaoInteligente(String nome) {
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
