package com.widera.petclinic.domain.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * Created by maciek on 25.07.16.
 */

@Entity
@Table
public class Pet extends BaseEntity {

    @Column
    @NotEmpty
    private String name;

    @Column
    @Max(value = 120, message = "Pet can't be older than 120 years")
    @Min(value = 0, message = "Pet can't be younger than 0 years")
    private int age;
    @Column
    private String petKind;

    public Pet() {
        super();
        name = "Undefined";
        age = 0;
        petKind = "Undefined";
    }

    public Pet(String name, int age, String petKind) {
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

    public String getPetKind() {
        return petKind;
    }

    public void setPetKind(String petKind) {
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
