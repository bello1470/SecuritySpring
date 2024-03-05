package org.bellotech.SpringSecurityRoleBase.repository;

import org.bellotech.SpringSecurityRoleBase.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(
            """
                    SELECT u FROM u WHERE u.username = :username
                    """
    )
    Optional<User> findUSerByUsername(String username);
}
