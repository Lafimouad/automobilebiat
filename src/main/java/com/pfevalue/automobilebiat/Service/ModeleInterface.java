package com.pfevalue.automobilebiat.Service;

import com.pfevalue.automobilebiat.Entity.Modele;

import java.util.List;
import java.util.Optional;

public interface ModeleInterface {

    List<Modele> retrieveAllModeles();
    Modele addModele(Modele modele);
    void deleteModele(Long id);
    Modele updateModele(Modele modele);
    Optional<Modele> FindModele(Long id);
}
