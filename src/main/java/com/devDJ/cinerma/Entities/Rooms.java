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
public class Rooms {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id_rooms") 
    private Long idRooms;
    private String name;
    private Long rows;
    private Long colum;


    //Relacion de uno a muchos una sala puede tiene deferentes horarios
    @OneToMany(fetch = FetchType.LAZY, cascade =  CascadeType.ALL )
    @JoinColumn(name = "id_horarios")
    private List<Horario> horarios;
    
}
