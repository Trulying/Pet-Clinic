package com.widera.petclinic.domain.repository;

import com.widera.petclinic.domain.entities.Pet;
import org.springframework.dao.DataAccessException;


public interface PetRepository {
    Pet findById(Long id) throws DataAccessException;
    void save(Pet pet) throws DataAccessException;
}
