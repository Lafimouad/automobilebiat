package com.pfevalue.automobilebiat.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Modele implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Id de la modele")
    public  Long id;

    @ApiModelProperty(notes = "nom de la modele")
    public String nom;

    @ApiModelProperty(notes = "image  de la modele")
    public String imageUrl;


    @ApiModelProperty(notes = "prix  de la modele")
    public double prix ;

    @ApiModelProperty(notes = "carrosserie  de la modele")
    @Enumerated(EnumType.STRING)
    public carrosserie_Type carrosserie;

    @ApiModelProperty(notes = "durée de la garantie  de la modele")
    public double garantie;

    @ApiModelProperty(notes = "nombre de places  de la modele")
    public int nbreDePlaces ;

    @ApiModelProperty(notes = "nombre de cylindres  de la modele")
    public int nbreDeCylindres ;

    @Enumerated(EnumType.STRING)
    @ApiModelProperty(notes = " type d'ernergie  de la modele")
    public Energie_Type energie ;

    @ApiModelProperty(notes = "puissance fiscale  de la modele")
    public double puissanceFiscale;

    @ApiModelProperty(notes = " Type de la boite de la modele")
    @Enumerated(EnumType.STRING)
    public Boite_Type boite ;

    @ApiModelProperty(notes = "nombre de rapports  de la modele")
    public int nbreDeRapports;

    @ApiModelProperty(notes = " Type de transmission de la modele")
    @Enumerated(EnumType.STRING)
    public Transmission_Type transmission;

    @ApiModelProperty(notes = " marque de la modele")
    @ManyToOne
    private Marque marque;









}
