package com.example.restapi.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.entidades.Contato;

public interface Repository extends JpaRepository<Contato,Long> {
    
}
