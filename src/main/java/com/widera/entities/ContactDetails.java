package com.widera.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

/**
 * Created by maciek on 24.07.16.
 */

@Embeddable
public class ContactDetails {
    @NotEmpty
    @Digits(fraction = 0, integer = 9) //Polish number has 9 digits
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotEmpty
    @Pattern(regexp = "(\\w[._-]?)+@(\\w[._-]?)+\\.\\w+")   //pattern to check only common mistakes
    @Column(name = "e_mail")
    private String eMail;

    public ContactDetails(String phoneNumber, String eMail) {
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
