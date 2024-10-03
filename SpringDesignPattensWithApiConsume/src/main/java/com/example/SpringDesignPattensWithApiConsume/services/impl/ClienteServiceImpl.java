package com.example.SpringDesignPattensWithApiConsume.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringDesignPattensWithApiConsume.models.Cliente;
import com.example.SpringDesignPattensWithApiConsume.models.Endereco;
import com.example.SpringDesignPattensWithApiConsume.models.repositories.ClienteRepository;
import com.example.SpringDesignPattensWithApiConsume.models.repositories.EnderecoRepository;
import com.example.SpringDesignPattensWithApiConsume.services.ClienteService;
import com.example.SpringDesignPattensWithApiConsume.services.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private EnderecoRepository endereco;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClientComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = repository.findById(id);
        if (clienteBd.isPresent()){
            salvarClientComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public void salvarClientComCep(Cliente cliente){
        String cep = cliente.getEndereco().getCep();
        Endereco e = endereco.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            endereco.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(e);
        repository.save(cliente);
    }

    
}
