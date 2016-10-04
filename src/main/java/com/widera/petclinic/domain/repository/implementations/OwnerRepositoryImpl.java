package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.Owner;
import com.widera.petclinic.domain.repository.OwnerRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;


/**
 * Created by macie_000 on 17.09.2016.
 */
@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Owner findById(Long id) throws DataAccessException {
        return entityManager.find(Owner.class, id);
    }

    public Collection<Owner> findByLastName(String lastName) throws DataAccessException {
        Query lastNameQuery = entityManager
                .createQuery("SELECT DISTINCT owner FROM Owner owner WHERE owner.surname=:lastName");
	    Collection<Owner> petOwners = lastNameQuery.getResultList();
		return petOwners;
    }

    public void save(Owner owner) throws DataAccessException {
		if(owner.isNull()) {
			entityManager.persist(owner);
		} else {
			entityManager.merge(owner);
		}
    }
}
