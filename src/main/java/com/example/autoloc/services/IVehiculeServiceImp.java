package com.example.autoloc.services;

import com.example.autoloc.entities.Vehicule;
import com.example.autoloc.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IVehiculeServiceImp implements IVehiculeService{
//    @Autowired
//    private VehiculeRepository vehiculeRepository;
    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> listerVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule consulterVehicule(Long idVehicule) {
        return vehiculeRepository.findById(idVehicule).orElse(null);
    }

    @Override
    public void supprimerVehicule(Long idVehicule) {
        vehiculeRepository.deleteById(idVehicule);

    }
}
