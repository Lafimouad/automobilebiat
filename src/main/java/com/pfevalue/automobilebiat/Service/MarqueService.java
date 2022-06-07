package com.pfevalue.automobilebiat.Service;

import com.pfevalue.automobilebiat.Entity.Marque;
import com.pfevalue.automobilebiat.Repository.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarqueService implements MarqueInterface {
    @Autowired
    MarqueRepository marqueRepository;

    @Override
    public List<Marque> retrieveAllMarques() {
        return (List<Marque>) marqueRepository.findAll();
    }

    @Override
    public Marque addMarque(Marque marque) {
        return marqueRepository.save(marque);
    }

    @Override
    public void deleteMarque(Long id) {
        marqueRepository.deleteById(id);
    }

    @Override
    public Marque updateMarque(Marque marque) {
        return marqueRepository.save(marque);
    }

    @Override
    public Optional<Marque> FindMarque(Long id) {
        return marqueRepository.findById(id);
    }

    @Override
    public List<Marque> findMarqueByName(String nom) {
        return marqueRepository.findMarqueByNom(nom);
    }
}
