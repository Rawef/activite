package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numabon;
    private LocalDate datedebut;
    private LocalDate datefin;
    private Float prixabon ;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeabon;

    public Abonnement() {
    }

    public Abonnement(Long numabon, LocalDate datedebut, LocalDate datefin, Float prixabon, TypeAbonnement typeabon) {
        this.numabon = numabon;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.prixabon = prixabon;
        this.typeabon = typeabon;
    }

    public Long getNumabon() {
        return numabon;
    }

    public void setNumabon(Long numabon) {
        this.numabon = numabon;
    }

    public LocalDate getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(LocalDate datedebut) {
        this.datedebut = datedebut;
    }

    public LocalDate getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDate datefin) {
        this.datefin = datefin;
    }

    public Float getPrixabon() {
        return prixabon;
    }

    public void setPrixabon(Float prixabon) {
        this.prixabon = prixabon;
    }

    public TypeAbonnement getTypeabon() {
        return typeabon;
    }

    public void setTypeabon(TypeAbonnement typeabon) {
        this.typeabon = typeabon;
    }
}
