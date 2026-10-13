package com.example.autoloc.services;

import com.example.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    List<Employe> listerEmployes();
    Employe consulterEmploye(Long idEmploye);
    void supprimerEmploye(Long idEmploye);
}
