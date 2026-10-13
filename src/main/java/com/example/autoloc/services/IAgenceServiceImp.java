package com.example.autoloc.services;

import com.example.autoloc.entities.Agence;
import com.example.autoloc.repositories.AgenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IAgenceServiceImp implements IAgenceService{
//    @Autowired
//    private AgenceRepository agenceRepository;
    private final AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> listerAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence consulterAgence(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);

    }
}
