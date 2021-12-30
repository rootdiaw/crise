package com.smart.crise.services;


import com.smart.crise.entities.CatastropheNaturelle;
import com.smart.crise.repository.CatastropheNaturelleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatastropheNaturelleServiceImpl  implements CatastropheNaturelleService{

    @Autowired
    private CatastropheNaturelleRepository catastropheNaturelleRepository;
    @Override
    public CatastropheNaturelle addNewCatastropheNaturelle(CatastropheNaturelle catastropheNaturelle) {
        return catastropheNaturelleRepository.save(catastropheNaturelle);
    }

    @Override
    public CatastropheNaturelle updateNewCatastropheNaturelle(CatastropheNaturelle catastropheNaturelle) {
        return catastropheNaturelleRepository.save(catastropheNaturelle);
    }

    @Override
    public List<CatastropheNaturelle> getAllCatastropheNaturelle() {
        return catastropheNaturelleRepository.findAll();
    }

    @Override
    public CatastropheNaturelle getCatastropheNaturelleParId(Long id) {
        return catastropheNaturelleRepository.findById(id).get();
    }

    @Override
    public void deleteCatastropheNaturelParId(Long id) {
        catastropheNaturelleRepository.deleteById(id);
    }
}
