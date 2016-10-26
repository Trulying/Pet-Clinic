package com.widera.petclinic.service.implementations;

import com.widera.petclinic.domain.entities.Owner;
import com.widera.petclinic.domain.repository.OwnerRepository;
import com.widera.petclinic.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    @Transactional
    public void addNewOwner(Owner owner) {
        ownerRepository.save(owner);
    }

    @Override
    @Transactional(readOnly = true)
    public Owner getUserById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Owner> getUserBySurname(String surname) {
        return ownerRepository.findByLastName(surname);
    }
}
