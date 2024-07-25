package one.dio.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepAPI;

// Facade para expor intenfaces mais complexas
public class Facade {

        // *** aqui criada uma interface simple
    public void migrarCliente(String nome, String cep){
        // como integrar o subsistema externo

        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);

        // com preencher esses parâmetros se ter todos // R: como acima
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
