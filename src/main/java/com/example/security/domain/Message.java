package com.example.security.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sender")
    private String sender;

    @Column(name = "consumer")
    private String consumer;

    @Column(name = "tag")
    private String tag;

    @Column(name = "message", columnDefinition = "text")
    private String message;


}
