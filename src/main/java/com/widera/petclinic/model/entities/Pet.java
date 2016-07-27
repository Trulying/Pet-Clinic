package com.widera.petclinic.model.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Created by maciek on 25.07.16.
 */

@Entity
@Table(name = "pets")   
public class Pet extends BaseEntity {

    @Column(name = "pet_name")
    @NotEmpty
    private String name;

    @Column(name = "pet_age")
    @Max(value = 120, message = "Pet can't be older than 120 years")
    @Min(value = 0, message = "Pet can't be younger than 0 years")
    private int age;

    @NotEmpty
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pet_type_name")
    private PetType petKind;

    public Pet() {
        super();
        name = "Undefined";
        age = 0;
        this.petKind = new PetType();
    }

    public Pet(String name, int age, PetType petKind) {
        this.name = name;
        this.age = age;
        this.petKind = petKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetType getPetKind() {
        return petKind;
    }

    public void setPetKind(PetType petKind) {
        this.petKind = petKind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pet pet = (Pet) o;

        if (age != pet.age) return false;
        if (!name.equals(pet.name)) return false;
        return petKind.equals(pet.petKind);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + petKind.hashCode();
        return result;
    }
}
