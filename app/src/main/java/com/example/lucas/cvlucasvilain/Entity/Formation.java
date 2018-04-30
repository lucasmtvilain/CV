package com.example.lucas.cvlucasvilain.Entity;

/**
 * Created by Lucas on 17/04/2018.
 */

public class Formation {
    String nom,annee,type;
    String description ,lieux;

    public String getLieux() {
        return lieux;
    }

    public void setLieux(String lieux) {
        this.lieux = lieux;
    }

    public Formation(String nom, String annee, String type, String description,String lieux) {
        this.nom = nom;
        this.annee = annee;
        this.type = type;
        this.description = description;
        this.lieux = lieux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
