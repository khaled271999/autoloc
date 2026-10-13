package com.example.autoloc.services;

import com.example.autoloc.entities.Maintenance;
import com.example.autoloc.repositories.MaintenanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IMaintenanceServiceImp implements IMaintenanceService{
//    @Autowired
//    private MaintenanceRepository maintenanceRepository;
    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> listerMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance consulterMaintenance(Long idMaintenance) {
        return maintenanceRepository.findById(idMaintenance).orElse(null);
    }

    @Override
    public void supprimerMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);

    }
}
