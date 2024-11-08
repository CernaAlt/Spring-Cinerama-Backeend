package com.devDJ.cinerma.Entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Dulceria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDulceria;
    private String nameCandyShop;
    private List<String> combo;
    private String price;
    private String stock;
    private String image;
}
