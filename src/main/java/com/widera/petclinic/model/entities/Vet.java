package com.widera.petclinic.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by maciek on 28.07.16.
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {
    @ManyToMany
    private List<Pet> pets;
    @Column(name = "vet_specialism")
    private String specialism;

    public Vet() {
        super();
        this.pets = new LinkedList<>();
        this.specialism = "Undefined";
    }

    public Vet(List<Pet> pets, String specialism) {
        this.pets = pets;
        this.specialism = specialism;
    }

    public Vet(Long id, String name,
               String surname,
               ContactDetails contactDetails,
               List<Pet> pets,
               String specialism) {
        super(id, name, surname, contactDetails);
        this.pets = pets;
        this.specialism = specialism;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Vet vet = (Vet) o;

        if (pets != null ? !pets.equals(vet.pets) : vet.pets != null) return false;
        return specialism != null ? specialism.equals(vet.specialism) : vet.specialism == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (pets != null ? pets.hashCode() : 0);
        result = 31 * result + (specialism != null ? specialism.hashCode() : 0);
        return result;
    }
}