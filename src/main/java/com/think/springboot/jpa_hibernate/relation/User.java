package com.think.springboot.jpa_hibernate.relation;

import jakarta.persistence.*;

@Entity
@Table(name = "user_map")
public class User {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

}
