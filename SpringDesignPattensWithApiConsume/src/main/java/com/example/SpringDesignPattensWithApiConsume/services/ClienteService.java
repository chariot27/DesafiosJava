package com.example.SpringDesignPattensWithApiConsume.services;

import com.example.SpringDesignPattensWithApiConsume.models.Cliente;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
