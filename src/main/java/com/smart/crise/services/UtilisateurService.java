package com.smart.crise.services;

import com.smart.crise.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {


    List<Utilisateur> getEmailAndPassword(String email, String password);
}
