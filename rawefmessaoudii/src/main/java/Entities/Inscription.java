package Entities;

import jakarta.persistence.*;

@Entity
public class Inscription {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long numinscription;
   private int numsemaine;

   @ManyToOne
   Skieur skieur;

   @ManyToOne
   Cours cours;

   public Inscription() {
   }

   public Inscription(Long numinscription, int numsemaine) {
      this.numinscription = numinscription;
      this.numsemaine = numsemaine;
   }

   public Long getNuminscription() {
      return numinscription;
   }

   public void setNuminscription(Long numinscription) {
      this.numinscription = numinscription;
   }

   public int getNumsemaine() {
      return numsemaine;
   }

   public void setNumsemaine(int numsemaine) {
      this.numsemaine = numsemaine;
   }
}
