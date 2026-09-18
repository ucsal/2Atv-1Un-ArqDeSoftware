package br.ucsal.smarthome.visitor;

public interface DispositivoVisitor {
    void visitar(LampadaInteligente lampada);
    void visitar(TermostatoInteligente termostato);
    void visitar(CameraSeguranca camera);
}
