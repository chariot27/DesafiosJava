package com.example;

import com.example.study.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
    }
}