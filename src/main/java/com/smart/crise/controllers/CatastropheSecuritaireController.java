package com.smart.crise.controllers;

import com.smart.crise.entities.CatastropheSecuritaire;
import com.smart.crise.services.CatastropheSecuritaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apicatastrophesecuritaire")
public class CatastropheSecuritaireController {

    private CatastropheSecuritaireService catastropheSecuritaireService;

    public CatastropheSecuritaireController(CatastropheSecuritaireService catastropheSecuritaireService) {
        super();
        this.catastropheSecuritaireService = catastropheSecuritaireService;
    }

    @GetMapping
    public List<CatastropheSecuritaire> getAllSecuritaire() {
        return catastropheSecuritaireService.getAllCatastropheSecuritaire();
    }

    @GetMapping("/id")
    public  CatastropheSecuritaire getSecuritaireById(@PathVariable("id") Long id){
        return catastropheSecuritaireService.getCatastropheSecuritaireParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteSecuritaire(@PathVariable("id") Long id){

        catastropheSecuritaireService.deleteCatastropheSecuritaireParId(id);

    }
    @PostMapping
    public CatastropheSecuritaire addSecuritaire(@RequestBody CatastropheSecuritaire catastropheSecuritaire){
        return catastropheSecuritaireService.addNewCatastropheSecuritaire(catastropheSecuritaire);
    }
}
