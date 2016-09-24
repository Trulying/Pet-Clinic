package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.Owner;
import com.widera.petclinic.domain.repository.interfaces.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;


/**
 * Created by macie_000 on 17.09.2016.
 */
public class OwnerRepositoryImpl implements OwnerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Owner findById(Long id) throws DataAccessException {
        return null;
    }

    public Collection<Owner> findByLastName(String lastName) throws DataAccessException {
        return null;
    }

    public void save(Owner owner) throws DataAccessException {

    }
}
