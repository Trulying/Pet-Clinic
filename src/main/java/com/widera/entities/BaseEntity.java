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
}
