package application;

import decorator.Dispositivo;
import decorator.GeladeiraInteligente;
import decorator.LampadaInteligente;
import decorator.MonitoramentoEnergiaDecorator;
import decorator.NotificacaoDecorator;
import decorator.TelevisaoInteligente;
import iterator.CasaInteligente;
import iterator.DispositivoCasa;
import iterator.DispositivoIterator;

public class Main {

	public static void main(String[] args) {

		System.out.println("-------decorator--------\n");

		Dispositivo lampada = new LampadaInteligente("Lampada da Sala");
		lampada = new MonitoramentoEnergiaDecorator(lampada);
		lampada = new NotificacaoDecorator(lampada);

		Dispositivo geladeira = new GeladeiraInteligente("Geladeira da cozinha");
		geladeira = new MonitoramentoEnergiaDecorator(geladeira);
		geladeira = new NotificacaoDecorator(geladeira);

		Dispositivo tv = new TelevisaoInteligente("TV da sala");
		tv = new MonitoramentoEnergiaDecorator(tv);
		tv = new NotificacaoDecorator(tv);

		System.out.println(lampada.getDescricao());
		lampada.ligar();
		System.out.println();
		System.out.println(geladeira.getDescricao());
		geladeira.ligar();
		System.out.println();
		System.out.println(tv.getDescricao());
		tv.ligar();

		System.out.println("\n-------iterator--------\n");

		CasaInteligente casa = new CasaInteligente(10);

		casa.adicionarDispositivo(new DispositivoCasa("Lampada Inteligente", "sala"));
		casa.adicionarDispositivo(new DispositivoCasa("Geladeira Inteligente", "cozinha"));
		casa.adicionarDispositivo(new DispositivoCasa("Tv Inteligente", "Quarto"));

		DispositivoIterator iterator = casa.criarIterator();

		while (iterator.temProximo()) {
			DispositivoCasa dispositivo = iterator.proximo();
			System.out.println(dispositivo);
		}

	}

}
