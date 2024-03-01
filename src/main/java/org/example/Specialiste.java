package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="specialiste")
@Getter@Setter
public class Specialiste extends Personne{
    @Id
    @Column(name = "specialiste_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private String name;
    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "medecin_id")
    private Medecin medecin_id;

}
