package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.CardService;
import com.example.demo.model.Card;

import java.util.List;

@RestController
@RequestMapping
public class CardController {

    @Autowired
    private CardService service;

    @GetMapping("/cards")
        public List<Card> getAllCards() { 
        return service.getAllCards();
    }
}
