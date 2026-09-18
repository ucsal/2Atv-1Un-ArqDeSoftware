package br.ucsal.smarthome.visitor;

public class ConsumoEnergiaVisitor implements DispositivoVisitor {
    private double potenciaTotalWatts;

    @Override
    public void visitar(LampadaInteligente lampada) {
        potenciaTotalWatts += lampada.getPotenciaWatts();
        System.out.println("Consumo analisado: " + lampada.getNome());
    }

    @Override
    public void visitar(TermostatoInteligente termostato) {
        potenciaTotalWatts += termostato.getPotenciaWatts();
        System.out.println("Consumo analisado: " + termostato.getNome());
    }

    @Override
    public void visitar(CameraSeguranca camera) {
        potenciaTotalWatts += camera.getPotenciaWatts();
        System.out.println("Consumo analisado: " + camera.getNome());
    }

    public double getPotenciaTotalWatts() {
        return potenciaTotalWatts;
    }
}
