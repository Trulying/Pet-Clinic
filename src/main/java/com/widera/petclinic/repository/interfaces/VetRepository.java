package com.widera.petclinic.repository.interfaces;

import com.widera.petclinic.model.entities.Vet;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

/**
 * Created by maciek on 30.07.16.
 */
public interface VetRepository {
    Vet findById(Long id) throws DataAccessException;

    Collection<Vet> findAll() throws DataAccessException;
}
