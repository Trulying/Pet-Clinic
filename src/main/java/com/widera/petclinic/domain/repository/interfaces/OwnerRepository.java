package com.widera.petclinic.domain.repository.interfaces;

import com.widera.petclinic.domain.entities.Owner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by maciek on 30.07.16.
 */
@Repository
public interface OwnerRepository {

    Owner findById(Long id) throws DataAccessException;

    Collection<Owner> findByLastName(String lastName) throws DataAccessException;

    void save(Owner owner) throws DataAccessException;
}
