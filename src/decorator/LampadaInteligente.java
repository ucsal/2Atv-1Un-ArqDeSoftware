package decorator;

public class LampadaInteligente implements Dispositivo {

	private String nome;

	public LampadaInteligente() {
	}

	public LampadaInteligente(String nome) {
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
