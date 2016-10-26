package com.widera.petclinic.service;


import com.widera.petclinic.domain.entities.Owner;

import java.util.Collection;

public interface OwnerService {
    void addNewOwner(Owner owner);
    Owner getUserById(Long id);
    Collection<Owner> getUserBySurname(String surname);
}
