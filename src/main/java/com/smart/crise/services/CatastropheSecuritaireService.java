package com.smart.crise.services;

import com.smart.crise.entities.CatastropheSecuritaire;

import java.util.List;


public interface CatastropheSecuritaireService  {

    CatastropheSecuritaire addNewCatastropheSecuritaire(CatastropheSecuritaire catastropheSecuritaire);

    CatastropheSecuritaire updateNewCatastropheSecuritaire(CatastropheSecuritaire catastropheSecuritaire);

    List<CatastropheSecuritaire> getAllCatastropheSecuritaire( );

    CatastropheSecuritaire getCatastropheSecuritaireParId( Long id);

    void deleteCatastropheSecuritaireParId(Long id);
}
