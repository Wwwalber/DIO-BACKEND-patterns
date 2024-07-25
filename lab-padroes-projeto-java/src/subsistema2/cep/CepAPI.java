package subsistema2.cep;

public class CepAPI {
    
    private static CepAPI instancia = new CepAPI();
    // já instancia, para quando for chamado já está pronto
    
    // private para garantir que ninguém comseguirá instanciar
    private CepAPI() {
        super();
    }

    // mas, para permitir que seja chamado 
    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        // simulando busca do CEP
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        // simulando busca do CEP
        return "SP";
    }
}
