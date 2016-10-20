package com.widera.petclinic.domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @Column(unique = true, nullable = false)
    private String username;
    private String password;
    private String sole;
    private String hash;
    private String role;
    private boolean enabled;

    @OneToOne
    private Owner owner;

    public User() {
        username = "undefined";
        password = "undefined";
        sole = "undefined";
        hash = "undefined";
        role = "undefined";
        enabled = false;
        owner = null;
    }

    public User(String username, String password, String sole, String hash,
                String role, boolean enabled,Owner owner) {
        this.username = username;
        this.password = password;
        this.sole = sole;
        this.hash = hash;
        this.role = role;
        this.enabled = enabled;
        this.owner = owner;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSole() {
        return sole;
    }

    public void setSole(String sole) {
        this.sole = sole;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
