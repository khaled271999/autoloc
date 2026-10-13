package com.example.autoloc.services;

import com.example.autoloc.entities.Contrat;
import com.example.autoloc.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IcontratServiceImp implements IContratService{
//    @Autowired
//    private ContratRepository contratRepository;
    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> listerContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat consulterContrat(Long idContrat) {
        return contratRepository.findById(idContrat).orElse(null);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }
}
