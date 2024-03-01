package org.example;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String nom;
    protected String prenom;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
