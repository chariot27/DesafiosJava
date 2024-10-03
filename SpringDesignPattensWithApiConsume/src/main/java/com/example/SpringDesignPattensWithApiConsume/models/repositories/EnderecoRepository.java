package com.example.SpringDesignPattensWithApiConsume.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDesignPattensWithApiConsume.models.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
