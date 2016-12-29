package com.widera.petclinic.domain.entities;


import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigInteger;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "user_id")
    private Long id;
    @Column(unique = true, nullable = false, name = "username", length = 30)
    private String username;
    @Column(name = "password", nullable = false, length = 30)
    private String password;
    @Column(name = "role")
    private String role;
    @Column(name = "enabled")
    private boolean enabled;

    @OneToOne
    private Owner owner;

    public User() {
        username = "";
        password = "";
        role = "USER";
        enabled = false;
        owner = null;
    }

    public User(String username, String password,
                String role, boolean enabled, Owner owner) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.enabled = enabled;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
