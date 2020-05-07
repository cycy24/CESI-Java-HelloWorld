package com.cesitp.bankonet;

public class Client {
    private String identifiant;
    private String nom;
    private String prenom;

    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    public double calculerAvoirTotal(){

        double totalAvoir = 0;

        if(this.compteCourant != null){
            totalAvoir += compteCourant.getSolde();
        }
        if(this.compteEpargne != null){
            totalAvoir += compteEpargne.getSolde();
        }

        return totalAvoir;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", compteCourant=" + compteCourant +
                ", compteEpargne=" + compteEpargne +
                '}';
    }
}
