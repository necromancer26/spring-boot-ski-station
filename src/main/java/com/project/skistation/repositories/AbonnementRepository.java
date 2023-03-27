package com.project.skistation.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.skistation.entities.Abonnement;

@Repository
public interface AbonnementRepository extends JpaRepository<Abonnement,Long>{
    
}
