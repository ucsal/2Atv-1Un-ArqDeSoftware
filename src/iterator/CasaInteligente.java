package iterator;

public class CasaInteligente {

	private DispositivoCasa[] dispositivos;
	private int quantidade;

	public CasaInteligente(int capacidade) {
		dispositivos = new DispositivoCasa[capacidade];
		quantidade = 0;
	}

	public void adicionarDispositivo(DispositivoCasa dispositivo) {
		if (quantidade < dispositivos.length) {
			dispositivos[quantidade] = dispositivo;
			quantidade++;
		}
	}

	public DispositivoIterator criarIterator() {
		return new DispositivoIterator(dispositivos, quantidade);
	}
}
