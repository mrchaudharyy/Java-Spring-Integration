package com.masterincoding.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "directors")
public class Directors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long director_id;

    private String first_name;

    private String last_name;

    private String nationality;

    private String date_of_birth;
}
