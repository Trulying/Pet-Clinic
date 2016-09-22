package com.widera.petclinic.domain.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

/**
 * Created by maciek on 24.07.16.
 */

@MappedSuperclass
public abstract class Person extends BaseEntity {

    @NotEmpty
    @Column(name = "name")
    private String name;
    @NotEmpty
    @Column(name = "surname")
    private String surname;
    @NotNull
    @Embedded
    private ContactDetails contactDetails;

    public Person() {
        super();
        name = "";
        surname = "";
        contactDetails = new ContactDetails();
    }

    public Person(Long id, String name, String surname, ContactDetails contactDetails) {
        super(id);
        this.name = name;
        this.surname = surname;
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

}
