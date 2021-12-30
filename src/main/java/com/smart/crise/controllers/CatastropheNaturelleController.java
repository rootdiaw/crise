package com.smart.crise.controllers;


import com.smart.crise.entities.CatastropheNaturelle;
import com.smart.crise.services.CatastropheNaturelleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/apicatastrophenaurelle")
public class CatastropheNaturelleController {

    private CatastropheNaturelleService catastropheNaturelleService;

    public CatastropheNaturelleController(CatastropheNaturelleService catastropheNaturelleService) {
        super();
        this.catastropheNaturelleService = catastropheNaturelleService;
    }

    @GetMapping
    public List<CatastropheNaturelle>  getAllNaturelle() {
        return catastropheNaturelleService.getAllCatastropheNaturelle();
    }

    @GetMapping("/id")
    public  CatastropheNaturelle getNaturelleById(@PathVariable("id") Long id){
        return catastropheNaturelleService.getCatastropheNaturelleParId(id);
    }
    @DeleteMapping("/{id}")
    public void DeleteNaturel(@PathVariable("id") Long id){

        catastropheNaturelleService.deleteCatastropheNaturelParId(id);

    }
    @PostMapping
    public CatastropheNaturelle addNaturel(@RequestBody CatastropheNaturelle catastropheNaturelle){
            return catastropheNaturelleService.addNewCatastropheNaturelle(catastropheNaturelle);
    }
    @PutMapping("/{id}")
    public CatastropheNaturelle updatePro (@PathVariable("id") Long id, @RequestBody CatastropheNaturelle catastropheNaturelle){
        CatastropheNaturelle catas= catastropheNaturelleService.getCatastropheNaturelleParId(id);
        catas.setVitesse(catastropheNaturelle.getVitesse());
        catas.setFrequence(catastropheNaturelle.getFrequence());
        catas.setAmpleur(catastropheNaturelle.getAmpleur());
        catas.setNiveaucontrole(catastropheNaturelle.getNiveaucontrole());
        catas.setNiveauperte((catastropheNaturelle.getNiveauperte()));

        return catastropheNaturelleService.updateNewCatastropheNaturelle(catastropheNaturelle);
    }


}
