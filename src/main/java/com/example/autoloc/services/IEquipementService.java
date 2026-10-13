package com.example.autoloc.services;

import com.example.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    List<Equipement> listerEquipements();
    Equipement consulterEquipement(Long idEquipement);
    void supprimerEquipement(Long idEquipement);
}
