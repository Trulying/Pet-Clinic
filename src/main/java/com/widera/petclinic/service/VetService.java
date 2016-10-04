package com.widera.petclinic.service;

import com.widera.petclinic.domain.entities.Vet;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */

public interface VetService {
    Collection<Vet> getAllVets();
    Vet getVetById(Long id);
}
