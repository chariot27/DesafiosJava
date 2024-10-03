package com.example.singleton;

public class SingletonHolderLazy {

    private static class Holder{
        public static SingletonHolderLazy instancia = new SingletonHolderLazy();
    }

    private SingletonHolderLazy(){
        super();
    }

    public static SingletonHolderLazy getInstancia(){
        return Holder.instancia;
    }

}
