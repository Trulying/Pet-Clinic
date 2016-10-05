package com.widera.petclinic.domain.repository;

import com.widera.petclinic.domain.entities.Vet;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

public interface VetRepository {
    Vet findById(Long id) throws DataAccessException;

    Collection<Vet> findAll() throws DataAccessException;
}
