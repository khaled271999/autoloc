package com.example.autoloc.services;

import com.example.autoloc.entities.Employe;
import com.example.autoloc.repositories.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IEmployeServiceImp implements IEmployeService{
//    @Autowired
//    private EmployeRepository employeRepository;
    private final EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> listerEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmploye(Long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void supprimerEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);

    }
}
