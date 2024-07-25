package one.dio.gof.singleton;

/**
 * Singleton "apressado"
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    // já instancia, para quando for chamado já está pronto
    
    // private para garantir que ninguém comseguirá instanciar
    private SingletonEager() {
        super();
    }

    // mas, para permitir que seja chamado 
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
