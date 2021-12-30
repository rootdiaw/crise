package com.smart.crise.controllers;

import com.smart.crise.entities.CatastropheSanitaire;
import com.smart.crise.services.CatastropheSanitaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apicatastrophesanitaire")
public class CatastropheSanitaireController {

    private CatastropheSanitaireService catastropheSanitaireService;

    public CatastropheSanitaireController(CatastropheSanitaireService catastropheSanitaireService) {
        super();
        this.catastropheSanitaireService = catastropheSanitaireService;
    }

    @GetMapping
    public List<CatastropheSanitaire> getAllSanitaire() {
        return catastropheSanitaireService.getAllCatastropheSanitaire();
    }

    @GetMapping("/id")
    public  CatastropheSanitaire getSanitaireById(@PathVariable("id") Long id){
        return catastropheSanitaireService.getCatastropheSanitaireParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteSanitaire(@PathVariable("id") Long id){

        catastropheSanitaireService.deleteCatastropheSanitaireParId(id);

    }
    @PostMapping
    public CatastropheSanitaire addSanitaire(@RequestBody CatastropheSanitaire catastropheSanitaire){
        return catastropheSanitaireService.addNewCatastropheSanitaire(catastropheSanitaire);
    }
}
