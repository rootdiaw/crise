package com.smart.crise.services;


import com.smart.crise.entities.CatastropheSanitaire;
import com.smart.crise.repository.CatastropheSanitaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatastropheSanitaireServiceImpl implements CatastropheSanitaireService{
    @Autowired
    private CatastropheSanitaireRepository catastropheSanitaireRepository;
    @Override
    public CatastropheSanitaire addNewCatastropheSanitaire(CatastropheSanitaire catastropheSanitaire) {
        return catastropheSanitaireRepository.save(catastropheSanitaire);
    }

    @Override
    public CatastropheSanitaire updateNewCatastropheSanitaire(CatastropheSanitaire catastropheSanitaire) {
        return catastropheSanitaireRepository.save(catastropheSanitaire);
    }

    @Override
    public List<CatastropheSanitaire> getAllCatastropheSanitaire() {
        return catastropheSanitaireRepository.findAll();
    }

    @Override
    public CatastropheSanitaire getCatastropheSanitaireParId(Long id) {
        return catastropheSanitaireRepository.findById(id).get();
    }

    @Override
    public void deleteCatastropheSanitaireParId(Long id) {

        catastropheSanitaireRepository.deleteById(id);

    }
}
