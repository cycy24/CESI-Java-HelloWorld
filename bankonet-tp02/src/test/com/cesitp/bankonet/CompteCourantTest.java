package com.cesitp.bankonet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest {

    @BeforeEach
    void setUp() {


    }

    @Test
    void totalCompte(){

        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        CompteCourant compteCourant2 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        CompteCourant compteCourant3 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        assertTrue(CompteCourant.nbComptesCourant == 3);

    }

    @Test
    void crediterCompte(){

        double oldSolde;
        double addAmount = 20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.crediter(addAmount);

        assertTrue(compteCourant1.getSolde() == oldSolde+addAmount);

    }

    @Test
    void debiterCompte(){

        double oldSolde;
        double remAmount = 20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.debiter(remAmount);

        assertTrue(compteCourant1.getSolde() == oldSolde-remAmount);

    }

    @AfterEach
    void tearDown() {
        CompteCourant.nbComptesCourant = 0;
    }
}