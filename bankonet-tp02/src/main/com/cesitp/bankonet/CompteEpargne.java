package com.cesitp.bankonet;

public class CompteEpargne extends Compte {


    private double tauxInteret ;


    public CompteEpargne(String numuero, String intitule, double solde, double tauxInteret) {
        super(numuero,intitule,solde);
        this.tauxInteret = tauxInteret;
    }



    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }



    public boolean isDebitAutorise(double amount){
        if((this.getSolde() - amount) > 0){
            return true;
        }
        return false;

    }

    public double calculerInteret(){

        if(this.tauxInteret > 0) {
            return this.getSolde() * (this.tauxInteret / 100);
        }else{
            return 0;
        }

    }

    @Override
    public String toString() {
        return super.toString() +'\n'+ "CompteEpargne{" +
                "tauxInteret=" + tauxInteret +
                '}';
    }
}
