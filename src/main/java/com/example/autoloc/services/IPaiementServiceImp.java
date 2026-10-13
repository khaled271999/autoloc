package com.example.autoloc.services;

import com.example.autoloc.entities.Paiement;
import com.example.autoloc.repositories.PaiementRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IPaiementServiceImp implements IPaiementService{
//    @Autowired
//    private PaiementRepository paiementRepository;
    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> listerPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement consulterPaiement(Long idPaiement) {
        return paiementRepository.findById(idPaiement).orElse(null);
    }

    @Override
    public void supprimerPaiement(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);

    }
}
