package com.pfevalue.automobilebiat.Repository;

import com.pfevalue.automobilebiat.Entity.Marque;
import com.pfevalue.automobilebiat.Entity.Modele;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModeleRepository extends CrudRepository<Modele,Long> {
    List<Modele> findByMarque(Marque marque);
}
