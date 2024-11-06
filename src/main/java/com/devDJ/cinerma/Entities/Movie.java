package com.devDJ.cinerma.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    
    @ManyToMany
    @JoinTable(
        name = "movie_cinemas",
        joinColumns = @jakarta.persistence.JoinColumn(name = "id_movie", referencedColumnName = "idMovie"),
        inverseJoinColumns = @jakarta.persistence.JoinColumn(name = "id_Cinemas", referencedColumnName = "idCinemas")
    )
    private List<Cinemas> cinemas;


    //Relacion de uno a muchos horarios
    @OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL )
    @JoinColumn(name = "id_horarios")
    private List<Horario> horarios;
}
