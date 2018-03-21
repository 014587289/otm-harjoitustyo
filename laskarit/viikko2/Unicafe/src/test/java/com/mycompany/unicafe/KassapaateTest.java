/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kakshoo
 */
public class KassapaateTest {
    
    public KassapaateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Kassapaate kassa;
    Maksukortti kortti;
    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = new Maksukortti(1000);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void rahaMaaraOikein() {
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void myydytLounaatOikein() {
        assertEquals(0, kassa.maukkaitaLounaitaMyyty() + kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void kateisOstoToimiiKunRiittaa() {
        kassa.syoEdullisesti(250);
        assertEquals(100240, kassa.kassassaRahaa());
        assertEquals(10, kassa.syoEdullisesti(250));
        assertEquals(2, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void kateisOstoToimiiKunEiRiita() {
        kassa.syoEdullisesti(230);
        assertEquals(100000, kassa.kassassaRahaa());
        assertEquals(230, kassa.syoEdullisesti(230));
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void korttiOstossaSaldoToimii() {
        assertEquals(true, kassa.syoEdullisesti(kortti));
        assertEquals(true, kassa.syoMaukkaasti(kortti));
        assertEquals(false, kassa.syoMaukkaasti(kortti));
        assertEquals(true, kassa.syoEdullisesti(kortti));
        assertEquals(false, kassa.syoEdullisesti(kortti));
    }
    @Test
    public void korttiOstossaMyynnitToimii() {
        kassa.syoEdullisesti(kortti);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
        kassa.syoMaukkaasti(kortti);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
        kassa.syoMaukkaasti(kortti);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
        kassa.syoEdullisesti(kortti);
        kassa.syoEdullisesti(kortti);
        assertEquals(2, kassa.edullisiaLounaitaMyyty());
    }
    @Test
    public void korttiOstossaKassaEiMuutu() {
        kassa.syoEdullisesti(kortti);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    @Test
    public void lataaminenToimii() {
        kassa.lataaRahaaKortille(kortti, 1000);
        assertEquals(2000, kortti.saldo());
        assertEquals(101000, kassa.kassassaRahaa());
        kassa.lataaRahaaKortille(kortti, -1);
    }
    @Test
    public void edullisestiSyontiKunRiittaa() {
        assertEquals(10, kassa.syoEdullisesti(250));
        assertEquals(100240, kassa.kassassaRahaa());
    }
    @Test
    public void edullisestiSyontiKunEiRiita() {
        assertEquals(10, kassa.syoEdullisesti(10));
        
    }
    
    @Test
    public void maukkaastiSyonti() {
        assertEquals(100, kassa.syoMaukkaasti(500));
        assertEquals(100400, kassa.kassassaRahaa());
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
        assertEquals(200, kassa.syoMaukkaasti(200));
    }
    
}
