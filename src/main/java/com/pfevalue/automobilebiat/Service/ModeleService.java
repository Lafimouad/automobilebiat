package com.pfevalue.automobilebiat.Service;

import com.pfevalue.automobilebiat.Entity.Marque;
import com.pfevalue.automobilebiat.Entity.Modele;
import com.pfevalue.automobilebiat.Repository.MarqueRepository;
import com.pfevalue.automobilebiat.Repository.ModeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModeleService implements  ModeleInterface{

    @Autowired
    ModeleRepository modeleRepository;
    @Autowired
    MarqueRepository marqueRepository;
    @Override
    public List<Modele> retrieveAllModeles() {
        return (List<Modele>)  modeleRepository.findAll();
    }

    @Override
    public Modele addModele(Modele modele) {
        return modeleRepository.save(modele);
    }

    @Override
    public void deleteModele(Long id) {
        modeleRepository.deleteById(id);
    }

    @Override
    public Modele updateModele(Modele modele) {
        return modeleRepository.save(modele);
    }

    @Override
    public Optional<Modele> FindModele(Long id) {
        return modeleRepository.findById(id);
    }

    @Override
    public List<Modele> findModeleByMarque(Long id) throws Exception {
        Optional<Marque> optionalMarque =marqueRepository.findById(id);
        if (!optionalMarque.isPresent()){
            throw  new Exception("oh no oh no oh no");
        }
        Marque marque=optionalMarque.get();
        return modeleRepository.findByMarque(marque);

    }
}
