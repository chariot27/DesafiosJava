package com.example.SpringDesignPattensWithApiConsume.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDesignPattensWithApiConsume.models.Cliente;


@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
