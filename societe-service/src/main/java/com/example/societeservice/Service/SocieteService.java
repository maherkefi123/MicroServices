package com.example.societeservice.Service;

import com.example.societeservice.Entity.Societe;
import com.example.societeservice.Repositorie.SocieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SocieteService {
    @Autowired
    SocieteRepository societeRepository;

    public List<Societe> getAll() {
        return societeRepository.findAll();
    }

    public Optional<Societe> getById(Long id) {
        return societeRepository.findById(id);
    }

    public Societe save(Societe societe) {
        return societeRepository.save(societe);
    }

    public void deleteById(Long id) {
        societeRepository.deleteById(id);
    }

    public Societe findById(Long id) {
        return societeRepository.findById(id).orElse(null);
    }

}
