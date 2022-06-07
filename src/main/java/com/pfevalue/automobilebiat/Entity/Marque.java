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
public class Marque implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Marque  id")
    public  Long id;
    @ApiModelProperty(notes = "le nom de la marque")

    public String nom;
    @ApiModelProperty(notes = "le pays de la marque")

    public String pays;
    @ApiModelProperty(notes = "l'image de la marque")

    public String imageUrl;
    @ApiModelProperty(notes = "List du modele  de la marque")
    @JsonIgnore
    @OneToMany(mappedBy="marque",
            cascade = CascadeType.REMOVE,
            fetch= FetchType.EAGER,orphanRemoval = true)
    private List<Modele> modeleList = new ArrayList<>();


}
