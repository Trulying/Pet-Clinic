package com.widera.petclinic.domain.repository.interfaces;

import com.widera.petclinic.domain.entities.Vet;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by maciek on 30.07.16.
 */
@Repository
public interface VetRepository {
    Vet findById(Long id) throws DataAccessException;

    Collection<Vet> findAll() throws DataAccessException;
}
