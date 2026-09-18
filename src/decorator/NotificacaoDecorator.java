package decorator;

public class NotificacaoDecorator extends DispositivoDecorator {

	public NotificacaoDecorator(Dispositivo dispositivo) {
		super(dispositivo);
	}

	@Override
	public void ligar() {
		super.ligar();
		enviarNotificacao("Dispositivo ligado");
	}


	@Override
	public void desligar() {
		super.desligar();
		enviarNotificacao("Dispositivo desligado");
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + " notificaçoes";
	}
	
	private void enviarNotificacao(String mensagem) {
		System.out.println("Notificacao: " + mensagem);
	}
}
