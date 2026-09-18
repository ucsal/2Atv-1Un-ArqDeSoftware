package decorator;

public abstract class DispositivoDecorator implements Dispositivo {

	protected Dispositivo dispositivo;

	public DispositivoDecorator() {

	}

	public DispositivoDecorator(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	@Override
	public void ligar() {
		dispositivo.ligar();
	}

	@Override
	public void desligar() {
		dispositivo.desligar();
	}

	@Override
	public String getDescricao() {
		return dispositivo.getDescricao();
	}

}
