package com.smart.crise.repository;

import com.smart.crise.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    List<Utilisateur> findByEmailAndPassword(String email, String password);
}
