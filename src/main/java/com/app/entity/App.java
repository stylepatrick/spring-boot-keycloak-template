package com.app.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter(AccessLevel.PROTECTED)
@Table(name = "APP")
@SequenceGenerator(
        name = "app_id_seq",
        sequenceName = "APP_ID_SEQ",
        allocationSize = 1)
public class App {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_id_seq")
    private Long id;

    @Column(name = "TEXT")
    private String text;
}
