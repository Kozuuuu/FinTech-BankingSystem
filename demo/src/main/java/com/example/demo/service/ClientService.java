package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Client;
import com.example.demo.repo.ClientRepo;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepo reporsitory;

    public List<Client> getAllClients() {
        return reporsitory.findAll();
    }
}
