package com.widera.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by maciek on 24.07.16.
 */

@MappedSuperclass
public class BaseEntity implements Serializable {
    private final static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

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
}
