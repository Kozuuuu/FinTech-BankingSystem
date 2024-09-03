package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Card;
import com.example.demo.repo.CardRepo;
import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepo repository;

    public List<Card> getAllCards() {
        return repository.findAll();
    }
}