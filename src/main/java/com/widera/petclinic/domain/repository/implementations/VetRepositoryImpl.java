package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.domain.repository.VetRepository;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class VetRepositoryImpl implements VetRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(readOnly = true)
	public Vet findById(Long id) throws DataAccessException {
		return entityManager.find(Vet.class, id);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Vet> findAll() throws DataAccessException {
		Query q = entityManager.createQuery("select distinct t from Vet t");
		return q.getResultList();
	}
}
