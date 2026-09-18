package visitor;

public class ManutencaoVisitor implements DispositivoVisitor {
    private int dispositivosAnalisados;

    @Override
    public void visitar(LampadaInteligente lampada) {
        dispositivosAnalisados++;
        System.out.println("Manutenção: verificar vida útil da " + lampada.getNome());
    }

    @Override
    public void visitar(TermostatoInteligente termostato) {
        dispositivosAnalisados++;
        System.out.println("Manutenção: verificar sensor do " + termostato.getNome());

    }

    @Override
    public void visitar(CameraSeguranca camera) {
        dispositivosAnalisados++;
        System.out.println("Manutenção: verificar lente e conexão da " + camera.getNome());
    }

    public int getDispositivosAnalisados() {
        return dispositivosAnalisados;
    }
}
