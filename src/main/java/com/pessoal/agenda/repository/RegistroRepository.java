package com.pessoal.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoal.agenda.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    
}
