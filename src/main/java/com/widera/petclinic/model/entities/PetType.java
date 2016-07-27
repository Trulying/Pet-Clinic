package com.widera.petclinic.model.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by maciek on 25.07.16.
 */
@Table(name = "pet_types")
public class PetType extends BaseEntity {
    @NotNull
    @Column(name = "pet_type_name")
    private String petTypeName;

    public String getPetTypeName() {
        return petTypeName;
    }

    public void setPetTypeName(String petTypeName) {
        this.petTypeName = petTypeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PetType petType = (PetType) o;

        return petTypeName.equals(petType.petTypeName);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + petTypeName.hashCode();
        return result;
    }
}
