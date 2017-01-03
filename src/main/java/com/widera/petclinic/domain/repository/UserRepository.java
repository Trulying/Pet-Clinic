package com.widera.petclinic.domain.repository;

import com.widera.petclinic.domain.entities.User;

/**
 * Created by maviek on 21.10.16.
 */
public interface UserRepository {
    User findUserByUsername(String username);
    void save(User user);
}
