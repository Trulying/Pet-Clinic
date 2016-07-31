package com.widera.petclinic.repository.interfaces;

import com.widera.petclinic.model.entities.Pet;
import org.springframework.dao.DataAccessException;

/**
 * Created by maciek on 30.07.16.
 */
public interface PetRepository {
    Pet findById(Long id) throws DataAccessException;

    void save(Pet pet) throws DataAccessException;
}
