package org.example;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import lombok.*;
@Entity
@Table(name="patient")
@Getter@Setter
public class Patient extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    private String nom;

    private String prenom;

    @Column(unique = true)
    private String nomDossier;

    private String telephone;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name ="Consultation",
            joinColumns = {@JoinColumn(name="patient_id")},
            inverseJoinColumns = {@JoinColumn(name = "medecin_id")}
    )
    Set<Medecin> medecins = new HashSet<Medecin>();
}
