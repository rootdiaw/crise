package com.smart.crise.controllers;
import com.smart.crise.entities.CatastropheNaturelle;
import com.smart.crise.entities.Utilisateur;
import org.springframework.web.bind.annotation.*;
import com.smart.crise.services.UtilisateurService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apiutilisateur")
public class UtilisateurRestController {


    private UtilisateurService utilisateurService;

    public UtilisateurRestController(UtilisateurService utilisateurService) {
        super();
        this.utilisateurService = utilisateurService;
    }

    @PostMapping(path="/auth")
    public List<Utilisateur> getEmailAndPassword(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.getEmailAndPassword(utilisateur.getEmail(),utilisateur.getPassword());
    }

}
