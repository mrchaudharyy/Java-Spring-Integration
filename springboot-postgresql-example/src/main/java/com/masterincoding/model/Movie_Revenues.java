package com.masterincoding.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "movie_revenues")
public class Movie_Revenues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long revenue_id;

    private Long movie_id;

    private Long domestic_takings;

    private Long international_takings;
}
