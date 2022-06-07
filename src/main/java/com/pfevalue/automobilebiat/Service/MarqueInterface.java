package com.pfevalue.automobilebiat.Service;

import com.pfevalue.automobilebiat.Entity.Marque;

import java.util.List;
import java.util.Optional;

public interface MarqueInterface {

    List<Marque> retrieveAllMarques();
    Marque addMarque(Marque marque);
    void deleteMarque(Long id);
    Marque updateMarque(Marque marque);
    Optional<Marque> FindMarque(Long id);
    List<Marque> findMarqueByName(String nom);

}
