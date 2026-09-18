package iterator;

public class DispositivoIterator {

	private DispositivoCasa[] dispositivos;
	private int posicao = 0;
	private int quantidade;

	public DispositivoIterator(DispositivoCasa[] dispositivos, int quantidade) {
		this.dispositivos = dispositivos;
		this.quantidade = quantidade;
	}

	public boolean temProximo() {
		return posicao < quantidade;
	}

	public DispositivoCasa proximo() {
		if (!temProximo()) {
			return null;
		}
		return dispositivos[posicao++];
	}

}
