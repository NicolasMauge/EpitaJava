package com.lafabrique.TP142_securite.application;

import com.lafabrique.TP142_securite.domaine.MyUser;

public interface MyUserService {
    MyUser findByUsername(String username);

    void createUser(MyUser user);
}
