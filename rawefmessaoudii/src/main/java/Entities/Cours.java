package Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numcours;
    private int niveau ;

    @Enumerated(EnumType.STRING)
    private TypeCours typecours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private Float prix;
    private int creneau ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="cours")
    private Set<Inscription> inscriptions;

    public Cours() {
    }

    public Cours(Long numcours, int niveau, TypeCours typecours, Support support, Float prix, int creneau) {
        this.numcours = numcours;
        this.niveau = niveau;
        this.typecours = typecours;
        this.support = support;
        this.prix = prix;
        this.creneau = creneau;
    }

    public Long getNumcours() {
        return numcours;
    }

    public void setNumcours(Long numcours) {
        this.numcours = numcours;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public TypeCours getTypecours() {
        return typecours;
    }

    public void setTypecours(TypeCours typecours) {
        this.typecours = typecours;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public int getCreneau() {
        return creneau;
    }

    public void setCreneau(int creneau) {
        this.creneau = creneau;
    }
}
