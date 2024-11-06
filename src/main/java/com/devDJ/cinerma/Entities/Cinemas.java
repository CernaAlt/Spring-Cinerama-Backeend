package com.devDJ.cinerma.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Cinemas {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@Column(name = "id_cinemas") 
    private Long idCinemas;
    @Column
    private String nameCinema;
    @Column
    private String city;
    @Column
    private String description;
    @Column
    private String address;

    @ManyToMany(mappedBy = "cinemas")
    private List<Movie> movies;

    //relacion de uno a muchos rooms
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_salas")
    private List<Rooms> rooms;

}
