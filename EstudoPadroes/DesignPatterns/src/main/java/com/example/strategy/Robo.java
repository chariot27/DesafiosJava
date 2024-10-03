/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.strategy;

/**
 *
 * @author maxta
 */
public class Robo {
    
    private Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }
    
    public void mover(){
        strategy.Mover();
    }
    
}
