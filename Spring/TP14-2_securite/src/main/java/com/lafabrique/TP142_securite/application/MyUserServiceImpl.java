package com.lafabrique.TP142_securite.application;

import com.lafabrique.TP142_securite.domaine.MyUser;
import com.lafabrique.TP142_securite.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    MyUserRepository repository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    public MyUser findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public void createUser(MyUser user) {
        System.out.println("test" + passwordEncoder);
        String encryptedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        repository.save(user);
    }
}
