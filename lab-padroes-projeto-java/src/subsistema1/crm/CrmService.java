package subsistema1.crm;

public class CrmService {

    // SIMULANDO O SERVIÇO

    //grantindo a não intanciação da classe
    private CrmService (){ // constructor protected
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println("nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("cidade: " + cidade);
        System.out.println("estado: " + estado+"\n");
    }
}
