package one.dio.gof.strategy;

public class Robo {
    private Comportamento comportamento; // estrategia // contexto

    // setar a estratégia
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    // executar a ação correspondente à estratégia
    public void mover(){ // delega a movimentação a estratégia
        comportamento.mover();
    }
}
