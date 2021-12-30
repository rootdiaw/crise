package com.smart.crise.services;


import com.smart.crise.entities.CatastropheSanitaire;

import java.util.List;

public interface CatastropheSanitaireService {


    CatastropheSanitaire addNewCatastropheSanitaire(CatastropheSanitaire catastropheSanitaire);

    CatastropheSanitaire updateNewCatastropheSanitaire( CatastropheSanitaire catastropheSanitaire);

    List<CatastropheSanitaire> getAllCatastropheSanitaire( );

    CatastropheSanitaire getCatastropheSanitaireParId( Long id);

    void deleteCatastropheSanitaireParId(Long id);
}
