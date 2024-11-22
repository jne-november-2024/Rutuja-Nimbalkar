package com.think.springboot.jpa_hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="accounts")
@Entity
public class Account {

    @Id
    private long id;
    @Column(name="account_holder_name")
    private String accountHolderName;
    private double balance;




}
