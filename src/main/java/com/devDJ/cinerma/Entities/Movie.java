package com.devDJ.cinerma.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMovie;
    private String title;
    private String sinopsis;
    private String director;
    private String genre;
    private String duration;
    private int age;
    private byte classification;
    private List<String> status;
    private List<String> language; //idioma original, subtitulos, doblada
    private List<String> available; //dispobible 3D, 2D, regular etc
    private List<String> distribution; 

    private String imageCard;
    private String imageDeails;
    private String urlTrailer;


    @OneToMany(mappedBy = "movie")
    @JsonBackReference
    private List<Schedule> schedules;
}
