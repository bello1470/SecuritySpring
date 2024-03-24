package org.bellotech.SpringSecurityRoleBase.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Table(name = "authorities")
@Entity
@Data
public class Authorities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "names")
    private String names;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;

}
