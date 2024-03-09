package org.bellotech.SpringSecurityRoleBase.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private  String password;

    @ManyToMany(fetch = FetchType.EAGER)

    @JoinTable(
            name = "user_authorities",
            joinColumns = @JoinColumn(
                    name = "userId"
            ),
            inverseJoinColumns = @JoinColumn(name = "authorityId")
    )
    private Set<Authorities> authorities;
}
