package decorator;

public class MonitoramentoEnergiaDecorator extends DispositivoDecorator {


	public MonitoramentoEnergiaDecorator(Dispositivo dispositivo) {
		super(dispositivo);
	}
	
	@Override
	public void ligar() {
		super.ligar();
		iniciarMonitoramento();
	}

	@Override
	public void desligar() {
		super.desligar();
		pararMonitoramento();
	}

	@Override
	public String getDescricao() {
		return super.getDescricao();
	}
	
	private void iniciarMonitoramento() {
		System.out.println("Monitoramento de enegria ativo");
	}
	
	private void pararMonitoramento() {
		System.out.println("Monitoramento de enegria desativado");
	}

	
}
