package com.cesitp.bankonet;

public class CompteCourant {
    String numuero ;
    String intitule ;
    double solde ;
    double montantDecouvertAutorise ;
    static int nbComptesCourant ;


    public CompteCourant(String numuero, String intitule, double solde, double montantDecouvertAutorise) {
        this.numuero = numuero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        CompteCourant.nbComptesCourant++;
    }

    public String getNumuero() {
        return numuero;
    }

    public void setNumuero(String numuero) {
        this.numuero = numuero;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public void crediter(double amount){
        this.solde = this.solde+amount;

    }

    public void debiter(double amount){
        this.solde = this.solde-amount;

    }
}
