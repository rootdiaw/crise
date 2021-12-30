package com.smart.crise.services;


import com.smart.crise.entities.CatastropheSecuritaire;
import com.smart.crise.repository.CatastropheSecuritaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CatastropheSecuritaireServiceImpl  implements  CatastropheSecuritaireService{

    @Autowired
    private CatastropheSecuritaireRepository catastropheSecuritaireRepository;
    @Override
    public CatastropheSecuritaire addNewCatastropheSecuritaire(CatastropheSecuritaire catastropheSecuritaire) {
        return catastropheSecuritaireRepository.save(catastropheSecuritaire);
    }

    @Override
    public CatastropheSecuritaire updateNewCatastropheSecuritaire(CatastropheSecuritaire catastropheSecuritaire) {
        return catastropheSecuritaireRepository.save(catastropheSecuritaire);
    }

    @Override
    public List<CatastropheSecuritaire> getAllCatastropheSecuritaire() {
        return catastropheSecuritaireRepository.findAll();
    }

    @Override
    public CatastropheSecuritaire getCatastropheSecuritaireParId(Long id) {
        return catastropheSecuritaireRepository.findById(id).get();
    }

    @Override
    public void deleteCatastropheSecuritaireParId(Long id) {

        catastropheSecuritaireRepository.deleteById(id);

    }
}
