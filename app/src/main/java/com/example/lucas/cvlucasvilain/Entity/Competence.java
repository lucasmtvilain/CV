package com.example.lucas.cvlucasvilain.Entity;

/**
 * Created by Lucas on 17/04/2018.
 */

public class Competence {
    private String competence,imageComp;
    int niv;

    public Competence(String competence, String imageComp, int niv) {
        this.competence = competence;
        this.imageComp = imageComp;
        this.niv = niv;
    }

    @Override
    public String toString() {
        return  "Compentences : "+this.competence ;
    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public String getImageComp() {
        return imageComp;
    }

    public void setImageComp(String imageComp) {
        this.imageComp = imageComp;
    }

    public int getNiv() {
        return niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }
}
