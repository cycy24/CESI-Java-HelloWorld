package com.cesitp.bankonet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    Client clientTest;

    @BeforeEach
    void setUp() {

    }

    @Test
    void calculerAvoirTotal() {
        clientTest = new Client("0","Test","Jean");

        CompteCourant compteCourant = new CompteCourant("1", "Compte Courant",2500,300);

        CompteEpargne compteEpargne = new CompteEpargne("1", "Compte Courant",2500,20.0);

        clientTest.setCompteCourant(compteCourant);
        clientTest.setCompteEpargne(compteEpargne);
        assertEquals(clientTest.calculerAvoirTotal(),5000,0.5);

    }

    @AfterEach
    void tearDown() {
    }


}