package one.dio.gof;

/**
 * Singleton "pregioçoso"
 */
public class SingletonLazy {
    private static SingletonLazy instancia;
    
    // private para garantir que ninguém comseguirá instanciar
    private SingletonLazy() {
        super();
    }

    // mas, para permitir que seja chamado 
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        } 
        return instancia;
    }
}
