package com.cesitp.bankonet;

public class Compte {

    private String numuero ;
    private String intitule ;
    private double solde ;

    public Compte(String numuero, String intitule, double solde) {
        this.numuero = numuero;
        this.intitule = intitule;
        if(solde<0){
            solde = 0;
        }
        this.solde = solde;
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

    public void crediter(double amount){
        if(amount>0) {
            this.setSolde(this.getSolde() + amount);
        }

    }

    @Override
    public String toString() {
        return "Compte{" +
                "numuero='" + numuero + '\'' +
                ", intitule='" + intitule + '\'' +
                ", solde=" + solde +
                '}';
    }
}
