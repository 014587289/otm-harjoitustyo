package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void saldoAlussaOikein() {
        assertEquals(10, kortti.saldo());
    }
    
    @Test
    public void lataaminenKasvattaaOikein() {
        kortti.lataaRahaa(100);
        assertEquals(110, kortti.saldo());
    }
    
    @Test
    public void ottaminenVaheneeOikein() {
        kortti.otaRahaa(3);
        assertEquals(7, kortti.saldo());
    }
    
    @Test
    public void eiMuutuJosEiRahaa() {
        kortti.otaRahaa(5);
        kortti.otaRahaa(10);
        assertEquals(5, kortti.saldo());
    }
    
    @Test
    public void rahatRiitti() {
        assertEquals(true, kortti.otaRahaa(10));
    }
    
    @Test
    public void rahatEiRiittanyt() {
        assertEquals(false, kortti.otaRahaa(12));
    }
    
    @Test
    public void toStringToimii() {
        kortti.otaRahaa(5);
        assertEquals("saldo: 0.5", kortti.toString());
    }
}
