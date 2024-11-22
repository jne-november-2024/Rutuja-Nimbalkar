package com.think.springboot.jpa_hibernate.relation;

import jakarta.persistence.*;

@Entity
public class Profile {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne(mappedBy = "profile")
    private User user;
}
