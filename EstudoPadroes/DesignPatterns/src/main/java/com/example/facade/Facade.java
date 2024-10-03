/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 *
 * @author maxta
 */
public class Facade {
    
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
    
}
