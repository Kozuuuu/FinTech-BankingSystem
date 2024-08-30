package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ClientService;
import com.example.demo.model.Client;

import java.util.List;

 
@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/client")
    public List<Client> getAllClients() {
        return service.getAllClients();
    }
}
