package one.dio.gof.singleton;

/**
 * Singleton "LazyHolder"
 * 
 *@see href="https://stackoverflow.com/a/24ô18148" >Referencia </a>
 */
public class SingletonLazyHolder {
    // encapsulating the instance of SingletonLazyHolder
    private static class instanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    // private para garantir que ninguém comseguirá instanciar
    private SingletonLazyHolder() {
        super();
    }

    // mas, para permitir que seja chamado 
    public static SingletonLazyHolder getInstancia() {
        return instanceHolder.instancia;
    }
}
