package com.smart.crise.services;

import com.smart.crise.entities.CatastropheNaturelle;

import java.util.List;

public interface CatastropheNaturelleService {

    CatastropheNaturelle addNewCatastropheNaturelle(CatastropheNaturelle catastropheNaturelle);

    CatastropheNaturelle updateNewCatastropheNaturelle( CatastropheNaturelle catastropheNaturelle);

    List<CatastropheNaturelle> getAllCatastropheNaturelle( );

    CatastropheNaturelle getCatastropheNaturelleParId( Long id);

    void deleteCatastropheNaturelParId(Long id);

}
