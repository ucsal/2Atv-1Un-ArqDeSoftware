package visitor;

public class CameraSeguranca implements DispositivoVisitable {
    private final String nome;
    private final double potenciaWatts;

    public CameraSeguranca(String nome, double potenciaWatts) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome é obrigatório.");
        }
        if (potenciaWatts < 0) {
            throw new IllegalArgumentException("A potência não pode ser negativa.");
        }
        this.nome = nome;
        this.potenciaWatts = potenciaWatts;
    }

    public String getNome() { return nome; }
    public double getPotenciaWatts() { return potenciaWatts; }

    @Override
    public void aceitar(DispositivoVisitor visitor) {
        visitor.visitar(this);
    }
}
