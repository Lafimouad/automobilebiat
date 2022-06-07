package com.pfevalue.automobilebiat.Repository;

import com.pfevalue.automobilebiat.Entity.Marque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarqueRepository extends CrudRepository<Marque,Long> {
    List<Marque> findMarqueByNom(String nom);
}
