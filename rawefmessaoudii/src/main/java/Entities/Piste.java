package Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Piste {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long numpiste;
   private String nompiste;
    @Enumerated(EnumType.STRING)
   private Couleur couleur;
   private int longuer ;
   private int pente;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skieur> skieur;

    public Piste() {
    }

    public Piste(Long numpiste, String nompiste, Couleur couleur, int longuer, int pente) {
        this.numpiste = numpiste;
        this.nompiste = nompiste;
        this.couleur = couleur;
        this.longuer = longuer;
        this.pente = pente;
    }

    public Long getNumpiste() {
        return numpiste;
    }

    public void setNumpiste(Long numpiste) {
        this.numpiste = numpiste;
    }

    public String getNompiste() {
        return nompiste;
    }

    public void setNompiste(String nompiste) {
        this.nompiste = nompiste;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLonguer() {
        return longuer;
    }

    public void setLonguer(int longuer) {
        this.longuer = longuer;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }
}
