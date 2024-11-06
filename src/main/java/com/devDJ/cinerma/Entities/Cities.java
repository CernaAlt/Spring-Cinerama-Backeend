package com.devDJ.cinerma.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Cities {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idCities;
    private String nameCity;
    

    //Relacion de muchos a muchos una ciudad puede tener muchos cines y un cine esta relacionado con una ciudad
    /*@OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL )
    @JoinColumn(name = "id_cinemas")
    private List<Cinemas> cinemas;*/
    @OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL )
    @JoinColumn(name = "id_Cinema")
    private List<Cinemas> cinemas;

    
}
