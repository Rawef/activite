package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Moniteur {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numMoniteur;
    private String nomM;
    private String prenomM ;
    private LocalDate dateRecru;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Cours> Cours;

    public Moniteur() {
    }

    public Moniteur(Long numMoniteur, String nomM, String prenomM, LocalDate dateRecru) {
        this.numMoniteur = numMoniteur;
        this.nomM = nomM;
        this.prenomM = prenomM;
        this.dateRecru = dateRecru;
    }

    public Long getNumMoniteur() {
        return numMoniteur;
    }

    public void setNumMoniteur(Long numMoniteur) {
        this.numMoniteur = numMoniteur;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getPrenomM() {
        return prenomM;
    }

    public void setPrenomM(String prenomM) {
        this.prenomM = prenomM;
    }

    public LocalDate getDateRecru() {
        return dateRecru;
    }

    public void setDateRecru(LocalDate dateRecru) {
        this.dateRecru = dateRecru;
    }
}
