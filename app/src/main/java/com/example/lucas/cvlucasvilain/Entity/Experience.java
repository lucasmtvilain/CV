package com.example.lucas.cvlucasvilain.Entity;

/**
 * Created by Lucas on 17/04/2018.
 */

public class Experience {
    String periode,nom,poste,contenu;

    public Experience(String periode, String nom, String poste, String contenu) {
        this.periode = periode;
        this.nom = nom;
        this.poste = poste;
        this.contenu = contenu;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
