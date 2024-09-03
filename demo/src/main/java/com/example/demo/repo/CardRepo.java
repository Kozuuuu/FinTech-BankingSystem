package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Card;

public interface CardRepo extends JpaRepository<Card, String> {

}