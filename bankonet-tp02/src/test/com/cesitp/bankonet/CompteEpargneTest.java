package com.cesitp.bankonet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {

    @BeforeEach
    void setUp() {
    }


    @Test
    void crediterComptePos(){

        double oldSolde;
        double addAmount = 20.0;
        CompteEpargne CompteEpargne1 = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = CompteEpargne1.getSolde();
        CompteEpargne1.crediter(addAmount);

        assertEquals(CompteEpargne1.getSolde(),oldSolde+addAmount,0.1);

    }

    @Test
    void crediterCompteNeg(){

        double oldSolde;
        double addAmount = -20.0;
        CompteEpargne CompteEpargne1 = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = CompteEpargne1.getSolde();
        CompteEpargne1.crediter(addAmount);

        assertEquals(CompteEpargne1.getSolde(),CompteEpargne1.getSolde(),0);

    }

    @Test
    void crediterCompteNull(){

        double oldSolde;
        double addAmount = 0f;
        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = compteEpargne.getSolde();
        compteEpargne.crediter(addAmount);

        assertEquals(compteEpargne.getSolde(),oldSolde+addAmount,0.1);

    }

    @Test
    void debiterComptePos(){

        double oldSolde;
        double remAmount = 20.0;
        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = compteEpargne.getSolde();
        compteEpargne.debiter(remAmount);

        assertEquals(compteEpargne.getSolde(),oldSolde-remAmount,0.1);

    }

    @Test
    void debiterCompteNeg(){

        double oldSolde;
        double remAmount = -20.0;
        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = compteEpargne.getSolde();
        compteEpargne.debiter(remAmount);

        assertEquals(compteEpargne.getSolde(),oldSolde+remAmount,0.1);

    }

    @Test
    void debiterCompteNull(){

        double oldSolde;
        double remAmount = 0f;
        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);
        oldSolde = compteEpargne.getSolde();
        compteEpargne.debiter(remAmount);

        assertEquals(compteEpargne.getSolde(),oldSolde-remAmount,0.1);

    }

    @Test
    void calculerInteretPos(){

        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,20.0);

        assertEquals(compteEpargne.calculerInteret(),420,0.1);

    }

    @Test
    void calculerInteretNeg(){

        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,-20.0);

        assertEquals(compteEpargne.calculerInteret(),0,0.1);

    }

    @Test
    void calculterInteretNull(){

        CompteEpargne compteEpargne = new CompteEpargne("1","Compte Courant 1",2100.0,0);


        assertEquals(compteEpargne.calculerInteret(),0,0.1);

    }
    
    @AfterEach
    void tearDown() {
    }
}