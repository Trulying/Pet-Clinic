package com.widera.petclinic.domain.repository.implementations;

import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.domain.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    @SuppressWarnings("unchecked")
    public User findUserById(String username) {
        List<User> user;

        user = em.createQuery("SELECT u FROM User u WHERE u.username=:user")
                .setParameter("user", username).getResultList();

        if(user.size() > 0) {
            return user.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void save(User user) {
        if(user.getId() == null) {
            em.persist(user);
        } else {
            em.merge(user);
        }
    }
}
