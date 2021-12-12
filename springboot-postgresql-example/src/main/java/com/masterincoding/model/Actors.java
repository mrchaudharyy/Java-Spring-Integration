package com.masterincoding.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "actors")
public class Actors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long actor_id;

    private String first_name;

    private String last_name;

    private String gender;

    private String date_of_birth;
}
