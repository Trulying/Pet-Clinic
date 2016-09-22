package com.widera.petclinic.domain.repository.interfaces;

import com.widera.petclinic.domain.entities.Pet;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

/**
 * Created by maciek on 30.07.16.
 */
@Repository
public interface PetRepository {
    Pet findById(Long id) throws DataAccessException;

    void save(Pet pet) throws DataAccessException;
}
