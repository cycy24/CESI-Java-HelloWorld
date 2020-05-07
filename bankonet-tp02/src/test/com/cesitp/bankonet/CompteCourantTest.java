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
    void constructeur(){

        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        assertTrue(compteCourant1 != null);

    }

    @Test
    void constructeurNeg(){

        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",-2100.0,300.0);

        assertTrue(compteCourant1 != null);
        assertTrue(compteCourant1.getSolde() == 0);

    }

    @Test
    void totalCompte(){

        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        CompteCourant compteCourant2 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        CompteCourant compteCourant3 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);

        assertTrue(CompteCourant.getNbComptesCourant() == 3);

    }

    @Test
    void crediterComptePos(){

        double oldSolde;
        double addAmount = 20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.crediter(addAmount);

        assertEquals(compteCourant1.getSolde(),oldSolde+addAmount,0.1);

    }

    @Test
    void crediterCompteNeg(){

        double oldSolde;
        double addAmount = -20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.crediter(addAmount);

        assertEquals(compteCourant1.getSolde(),compteCourant1.getSolde(),0);

    }

    @Test
    void crediterCompteNull(){

        double oldSolde;
        double addAmount = 0f;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.crediter(addAmount);

        assertEquals(compteCourant1.getSolde(),oldSolde+addAmount,0.1);

    }

    @Test
    void debiterComptePos(){

        double oldSolde;
        double remAmount = 20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.debiter(remAmount);

        assertEquals(compteCourant1.getSolde(),oldSolde-remAmount,0.1);

    }

    @Test
    void debiterCompteNeg(){

        double oldSolde;
        double remAmount = -20.0;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.debiter(remAmount);

        assertEquals(compteCourant1.getSolde(),oldSolde+remAmount,0.1);

    }

    @Test
    void debiterCompteNull(){

        double oldSolde;
        double remAmount = 0f;
        CompteCourant compteCourant1 = new CompteCourant("1","Compte Courant 1",2100.0,300.0);
        oldSolde = compteCourant1.getSolde();
        compteCourant1.debiter(remAmount);

        assertEquals(compteCourant1.getSolde(),oldSolde-remAmount,0.1);

    }

    @AfterEach
    void tearDown() {
        CompteCourant.setNbComptesCourant(0);
    }
}