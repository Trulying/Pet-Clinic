package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public User findUserById(String username) {
        List<User> user = new ArrayList<>();

        user = em.createQuery("select u from User u where u.username=:user")
                .setParameter("user", username).getResultList();

        if(user.size() > 0) {
            return user.get(0);
        } else {
            return null;
        }
    }
}
