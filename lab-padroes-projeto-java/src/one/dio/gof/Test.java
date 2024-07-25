package one.dio.gof;

public class Test {
    public static void main(String[] args) {
        
        // teste about de Singleton Design Patterns
        SingletonLazy lazy = SingletonLazy.getInstancia(); // não aceita new. o contructor é privado
        System.out.println(lazy);
        // será que pegou a mesma instancia
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // eager
        SingletonEager eager = SingletonEager.getInstancia(); 
        System.out.println(eager);
        // será que pegou a mesma instancia
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        // lazyHolder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia(); 
        System.out.println(lazyHolder);
        // será que pegou a mesma instancia
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);    
    }
}
