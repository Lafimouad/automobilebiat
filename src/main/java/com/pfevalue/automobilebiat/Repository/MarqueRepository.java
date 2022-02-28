package com.pfevalue.automobilebiat.Repository;

import com.pfevalue.automobilebiat.Entity.Marque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarqueRepository extends CrudRepository<Marque,Long> {
}
