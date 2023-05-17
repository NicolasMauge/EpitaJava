package com.lafabrique.TP142_securite.application;

import com.lafabrique.TP142_securite.domaine.MyUser;
import com.lafabrique.TP142_securite.repository.MyUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    MyUserRepository repository;
    @Override
    public MyUser findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
