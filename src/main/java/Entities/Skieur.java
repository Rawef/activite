package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numskieur;
    private String nomS;
    private String prenomS;
    private LocalDate datenaissance;
    private String ville;

    @ManyToMany(mappedBy="skieur", cascade = CascadeType.ALL)
    private Set<Piste> Piste;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="skieur")
    private Set<Inscription> inscriptions;

    
    @OneToOne
    private Abonnement abonnement;

    public Skieur() {
    }

    public Skieur(Long numskieur, String nomS, String prenomS, LocalDate datenaissance, String ville) {
        this.numskieur = numskieur;
        this.nomS = nomS;
        this.prenomS = prenomS;
        this.datenaissance = datenaissance;
        this.ville = ville;
    }

    public Long getNumskieur() {
        return numskieur;
    }

    public void setNumskieur(Long numskieur) {
        this.numskieur = numskieur;
    }

    public String getNomS() {
        return nomS;
    }

    public void setNomS(String nomS) {
        this.nomS = nomS;
    }

    public String getPrenomS() {
        return prenomS;
    }

    public void setPrenomS(String prenomS) {
        this.prenomS = prenomS;
    }

    public LocalDate getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
