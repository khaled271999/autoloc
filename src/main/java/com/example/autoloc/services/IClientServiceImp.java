package com.example.autoloc.services;

import com.example.autoloc.entities.Client;
import com.example.autoloc.repositories.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IClientServiceImp implements IClientService{
//    @Autowired
//    private ClientRepository clientRepository;
    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client modifierClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> listerClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client consulterClient(Long idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public void supprimerClient(Long idClient) {
        clientRepository.deleteById(idClient);

    }
}
