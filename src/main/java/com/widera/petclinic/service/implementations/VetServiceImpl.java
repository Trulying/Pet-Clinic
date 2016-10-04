package com.widera.petclinic.service.implementations;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.domain.repository.VetRepository;
import com.widera.petclinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */
@Service
public class VetServiceImpl implements VetService {
    @Autowired
    private VetRepository vetRepository;

    @Override
    @Transactional
    public Collection<Vet> getAllVets() {
        return vetRepository.findAll();
    }

    @Override
    @Transactional
    public Vet getVetById(Long id) {
        return vetRepository.findById(id);
    }
}
