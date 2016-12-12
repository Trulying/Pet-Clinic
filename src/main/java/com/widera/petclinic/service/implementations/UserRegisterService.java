package com.widera.petclinic.service.implementations;

import com.widera.petclinic.domain.entities.User;
import com.widera.petclinic.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by macie_000 on 12.12.2016.
 */
@Service
public class UserRegisterService implements com.widera.petclinic.service.UserRegisterService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
