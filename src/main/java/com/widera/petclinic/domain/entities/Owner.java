package com.widera.petclinic.domain.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Pet_Owner")
public class Owner extends Person {
    @OneToMany
    private Set<Pet> pets;

    public Owner() {
        super();
        pets = new HashSet<>();
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Owner owner = (Owner) o;

        return pets != null ? pets.equals(owner.pets) : owner.pets == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pets != null ? pets.hashCode() : 0);
        return result;
    }
}
