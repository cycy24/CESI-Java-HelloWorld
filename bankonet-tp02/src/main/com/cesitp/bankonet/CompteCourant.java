package com.cesitp.bankonet;

public class CompteCourant extends Compte {

    private double montantDecouvertAutorise ;
    private static int nbComptesCourant ;

    public CompteCourant(String numuero, String intitule, double solde) {
        super(numuero,intitule,solde);
        CompteCourant.nbComptesCourant++;
    }

    public CompteCourant(String numuero, String intitule, double solde, double montantDecouvertAutorise) {
        this(numuero, intitule, solde);

        this.montantDecouvertAutorise = montantDecouvertAutorise;

    }

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }



    public void debiter(double amount){
        if (this.isDebitAutorise(amount)) {
            if (amount < 0) {
                this.setSolde(this.getSolde() + amount);
            } else {
                this.setSolde(this.getSolde() - amount);
            }
        }

    }

    public boolean isDebitAutorise(double amount){
        if((this.getSolde() - amount ) > -montantDecouvertAutorise){
            return true;
        }
        return false;

    }

    public static int getNbComptesCourant() {
        return nbComptesCourant;
    }

    public static void initNbCompte(){
        CompteCourant.nbComptesCourant = 0;
    }

    @Override
    public String toString() {
        return super.toString() + '\n'+ "CompteCourant{" +
                "montantDecouvertAutorise=" + montantDecouvertAutorise +
                '}';
    }
}
