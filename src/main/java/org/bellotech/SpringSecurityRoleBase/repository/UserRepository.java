package org.bellotech.SpringSecurityRoleBase.repository;

import org.bellotech.SpringSecurityRoleBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

// (1) first stage = repo

public interface UserRepository extends JpaRepository<User, Integer> {


    //quary base jpa

    @Query("select s from User s where s.username = ?1")
    Optional<User> findUSerByUsername(String username);
}
