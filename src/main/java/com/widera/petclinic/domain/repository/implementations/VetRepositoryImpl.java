package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.domain.repository.interfaces.VetRepository;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */
public class VetRepositoryImpl implements VetRepository {
    @Override
    public Vet findById(Long id) throws DataAccessException {
        return null;
    }

    @Override
    public Collection<Vet> findAll() throws DataAccessException {
        return null;
    }
}
