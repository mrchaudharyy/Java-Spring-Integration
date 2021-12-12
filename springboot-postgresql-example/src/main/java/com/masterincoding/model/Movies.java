package com.masterincoding.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "movies")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movie_id;

    private String movie_name;

    private String movie_lang;

    private Long movie_length;

    private String release_date;

    private String age_certificate;

    private Long director_id;
}
