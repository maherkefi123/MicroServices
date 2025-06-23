package com.example.societeservice.Controller;

import com.example.societeservice.Entity.Societe;
import com.example.societeservice.Service.SocieteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/societes")
public class SocieteController {
    @Autowired
    SocieteService societeService;

    @PostMapping
    public Societe addSociete(@RequestBody Societe societe) {

        return societeService.save(societe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSociete(@PathVariable Long id) {
        societeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Societe> getSociete(@PathVariable Long id) {
        Societe societe = societeService.findById(id);
        if (societe != null) {
            return ResponseEntity.ok(societe);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
