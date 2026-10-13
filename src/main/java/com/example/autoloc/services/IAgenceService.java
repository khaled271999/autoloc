package com.example.autoloc.services;

import com.example.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    List<Agence> listerAgences();
    Agence consulterAgence(Long idAgence);
    void supprimerAgence(Long idAgence);
}
