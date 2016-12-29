package com.widera.petclinic.domain.repository;

import com.widera.petclinic.domain.entities.Owner;
import org.springframework.dao.DataAccessException;

import java.util.Collection;


public interface OwnerRepository {
    Owner findById(Long id) throws DataAccessException;
    Collection<Owner> findByLastName(String lastName) throws DataAccessException;
    void save(Owner owner) throws DataAccessException;
}
