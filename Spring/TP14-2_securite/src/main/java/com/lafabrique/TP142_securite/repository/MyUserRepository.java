package com.lafabrique.TP142_securite.repository;

import com.lafabrique.TP142_securite.domaine.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}
