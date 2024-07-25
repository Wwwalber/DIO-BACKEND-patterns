package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.Comportamento;
import one.dio.gof.strategy.ComportamentoAgressivo;
import one.dio.gof.strategy.ComportamentoDefensivo;
import one.dio.gof.strategy.ComportamentoNormal;
import one.dio.gof.strategy.Robo;

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
        
                // teste about de Strategy Design Patterns

        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();

        // *** o comportamento vai variar segundo diferentes padrões (estratégias) de comportamento
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // ** FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Walber", "02254155555");
        facade.migrarCliente("Maria", "02254155555");
    }
}
