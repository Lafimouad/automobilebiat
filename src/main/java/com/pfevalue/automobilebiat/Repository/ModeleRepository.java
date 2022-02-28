package com.pfevalue.automobilebiat.Repository;

import com.pfevalue.automobilebiat.Entity.Modele;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeleRepository extends CrudRepository<Modele,Long> {
}
