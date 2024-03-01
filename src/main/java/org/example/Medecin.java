package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="medecin")
@Getter@Setter
public class Medecin {
    @Id
    @Column(name = "medecin_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String prenom;

    private String grade;

    private int salaire;

    @ManyToMany(mappedBy = "medecins")
    private Set<Patient> patients=new HashSet<>();
}
