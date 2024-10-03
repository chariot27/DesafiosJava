package com.example.main;

import com.example.facade.Facade;
import com.example.singleton.SingletonHolderLazy;
import com.example.singleton.SingletonLazy;
import com.example.strategy.Comportamento;
import com.example.strategy.ComportamentoAgressivo;
import com.example.strategy.ComportamentoDefensivo;
import com.example.strategy.ComportamentoNormal;
import com.example.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("SINGLETON");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonHolderLazy lazyHolder = SingletonHolderLazy.getInstancia();
        System.out.println(lazyHolder);
        
        System.out.println("STRATEGY");
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Robo rb = new Robo();
        rb.setStrategy(normal);
        rb.mover();
        rb.mover();
        rb.setStrategy(defensivo);
        rb.mover();
        rb.setStrategy(agressivo);
        rb.mover();
        
        System.out.println("FACADE");
        Facade facade = new Facade();
        facade.migrarCliente("Max", "95171120");
        
    }
}