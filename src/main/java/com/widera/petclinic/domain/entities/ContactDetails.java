package com.widera.petclinic.domain.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.Valid;
import javax.validation.constraints.Digits;

/**
 * Created by maciek on 24.07.16.
 */

@Embeddable
public class ContactDetails {
    @NotEmpty
    @Digits(fraction = 0, integer = 9) //Polish number has 9 digits
    @Column(name = "phone_number")
    @Valid
    private String phoneNumber;

    @NotEmpty
    @Email
    @Column(name = "e_mail")
    private String eMail;

    public ContactDetails() {
        phoneNumber = "";
        eMail = "";
    }

    public ContactDetails(String phoneNumber, String eMail) {
        this.phoneNumber = phoneNumber.trim();
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
       return "[phone number = " + phoneNumber + " e-mail " + eMail +"]";
    }

    @Override
    public int hashCode() {
        int result = phoneNumber.hashCode();
        result = 31 * result + eMail.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContactDetails that = (ContactDetails) o;

        if (!phoneNumber.equals(that.phoneNumber)) return false;
        return eMail.equals(that.eMail);

    }
}
