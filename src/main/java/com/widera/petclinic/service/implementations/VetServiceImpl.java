package com.widera.petclinic.service.implementations;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.domain.repository.interfaces.VetRepository;
import com.widera.petclinic.service.interfaces.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */
public class VetServiceImpl implements VetService {
    @Autowired
    private VetRepository vetRepository;

    @Override
    public Collection<Vet> getAllVets() {
        return vetRepository.findAll();
    }
}
