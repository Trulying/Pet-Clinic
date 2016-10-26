package com.widera.petclinic.domain.entities;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    private final static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    public BaseEntity() {
        this.id = null;
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof BaseEntity))
            return false;

        return this.getId() == ((BaseEntity) obj).getId();
    }

    @Override
    public int hashCode(){
        return this.getId().hashCode();
    }

    @Override
    public String toString() {
        return "[" + getId() + "]";
    }

    public boolean isNull() {
        if(id == null)
            return true;
        return false;
    }
}
