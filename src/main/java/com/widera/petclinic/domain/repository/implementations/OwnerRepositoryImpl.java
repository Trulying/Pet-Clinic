package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.Owner;
import com.widera.petclinic.domain.repository.interfaces.OwnerRepository;
import org.springframework.dao.DataAccessException;

import java.util.Collection;


/**
 * Created by macie_000 on 17.09.2016.
 */
public class OwnerRepositoryImpl implements OwnerRepository {

    public Owner findById(Long id) throws DataAccessException {
        return null;
    }

    public Collection<Owner> findByLastName(String lastName) throws DataAccessException {
        return null;
    }

    public void save(Owner owner) throws DataAccessException {

    }
}
