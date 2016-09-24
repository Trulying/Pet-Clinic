package com.widera.petclinic.service.interfaces;

import com.widera.petclinic.domain.entities.Vet;
import com.widera.petclinic.domain.repository.interfaces.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by macie_000 on 24.09.2016.
 */
@Service
public interface VetService {
    Collection<Vet> getAllVets();
}
