package com.widera.petclinic.repository.interfaces;

import com.widera.petclinic.model.entities.Owner;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

/**
 * Created by maciek on 30.07.16.
 */
public interface OwnerRepository {

    Owner findById(Long id) throws DataAccessException;

    Collection<Owner> findByLastName(String lastName) throws DataAccessException;

    void save(Owner owner) throws DataAccessException;

}
