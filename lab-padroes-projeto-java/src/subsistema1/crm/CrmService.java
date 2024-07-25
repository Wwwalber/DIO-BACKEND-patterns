package subsistema1.crm;

public class CrmService {

    // SIMULANDO O SERVIÇO

    //grantindo a não intanciação da classe
    private CrmService (){ // constructor protected
        super();
    }

    public static void gravarCliente(String nome, String ceps, String estado, String cidade){
        System.out.println("Cliente salvo no sistema de CRM.");
    }
}
