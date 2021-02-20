package com.example.security.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String serial;
}
