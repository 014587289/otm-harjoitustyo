# Arkkitehtuurikuvaus

## Rakenne

Sovelluksen pakkausrakenne jakautuu testipakkauksiin ja sovelluksen toiminnan sisältäviin pakkauksiin, joita on kaksi. Toisessa käsitellään sovellusken käynnistäminen 
sekä käyttöliittymä, ja toisesta löytyy sovelluslogiikan toteuttavat luokat. Ohjelman rakenne on tästä syystä varsin yksinkertainen.

## Käyttöliittymä

Tekstikäyttöliittymä antaa ohjeet inputtien syöttämiseen ja kertoo, jos input on vääränlaista. Sovelluksen käynnistyessä käyttäjä valitsee tekstivalikosta, 
mitä hän haluaa sovelluksen tekevän, ja käyttöliittymä etenee sen mukaisesti.

Kun laskutoimitus on suoritettu, palaa käyttöliittymä aina takaisin alkuun, jolloin käyttäjä voi laskea useita laskutoimituksia 
tai tarkastella laskuhistoriaansa käynnistämättä ohjelmaa uusiksi.

## Sovelluslogiikka

Sovelluksen tärkeimmät luokat ovat Calculator, Inputter sekä Operator.

Calculator on käyttöliittymäluokka, jota käytetään käyttäjän ohjeistamiseen inputtien antamisessa 
sekä laskutoimitusten tulosten tulostamiseen.

Inputter ottaa vastaan käyttäjän syöttämät inputit ja varmistaa, että ne ovat oikean tyylisiä. Esimerkiksi lukua pyydettäessä Inputter pitää huolen, ettei käyttäjä syötä 
merkkijonoja inputtina. Tarkistetut inputit siirretään luokan Operator oliolle, joka suorittaa laskutoimitukset ja antaa käyttöliittymälle tiedon tulostettavista tuloksista.

Sovellukseen kuuluu myös main-luokka, jonka vastuulla on Calculator-olion luominen ja sen käynnistäminen.

Yksinkertainen sovellusta kuvaava luokkakaavio:

<img src="https://yuml.me/3ab46a4b.png" width="450">

## Tietojen pysyväistallennus

Käyttäjän tekemät laskutoimitukset tallennetaan tekstitiedostoon, ja niitä voi tarkastella tulostamalla laskuhistorian käyttöliittymästä löytyvän toiminnallisuuden avulla.
Käyttöliittymä tarjoaa myös mahdollisuuden historian tyhjentämiseen.

Tekstitiedostosta löytyvät laskutoimitukset ovat merkkijonoja, muotoa esimerkiksi "3 + 4 = 7" tai "sin(0) = 0".

## Päätoiminnallisuus

Sovelluksen perustoiminnallisuutta kuvaava sekvenssikaavio:

<img src="https://www.websequencediagrams.com/cgi-bin/cdraw?lz=VGl0bGUgQ2FsY3VsYXRvciAtIGxhc2t1dG9pbWl0dXN0ZW4gdGVrZW1pbmVuCgpNYWluLT4AJQo6IGNhbGMgPSBuZXcAOwsoKQATFy5zdGFydAAcDQByCi0-SW5wdXR0ZXI6IGlucABPBwAMCAAcD09wZXIAfAZvcHIAegcADAgAPRl0aGlzLmkAXgcuc2V0ACkJABUFbwBNBykKAFQXZwAnCykKAHsILQCCBA4APggAgU4MAIFPDAAXCQCBbg1TY2FubmVyOiBzY24AgkkHAAwHKACBAg0gLT4AggoJOiBjaG9vc2UAggYGaW9uKCkKAII7CABHC2FzayBmb3IgAIF0BSBmcm9tIHVzZXIKAGwHAIEKE2lvbgBACSAtLT4AhBYLABcMAIEIDwCDCQpzZXRMYXMAglcHaW9uKABOCQCBKyEAg34FAHILPgCBfwgAgSchAIEkBQCENQ0AOg8AgRMNAIRmBSgAhAcFAIJPEQCEUgpkbwCCUgoAJQcAhHEIAIIHEXJlc3VsdCBvZgCCFgwKCg&s=napkin" width="450">

## Ohjelman rakenteeseen jääneet heikkoudet

### Käyttöliittymän eriyttäminen

Käyttöliittymä sekä syötteiden vastaanotto ja käsittely on eriytetty toisistaan, mutta tiedostoon kirjoittaminen ja sen tarkastelu on edelleen käyttöliittymäluokan vastuulla. 
Tämän voisi eriyttää käyttöliittymästä selkeämmän sovellusrakenteen takaamiseksi.

### Tallennus

Koodista löytyy jonkin verran toistoa, sillä tiedoston käsittely Javalla on aika vierasta, joten ainoa tuntemani tapa luoda tiedosto ja käsitellä sitä on varsin kömpelö.

### Toiminnallisuuden laajentaminen

Sovelluksen toiminnallisuus on suppeahko. Jos aikaa jatkokehitykseen olisi, voisi laskimeen lisätä toiminnallisuutta kuten funktioiden tarkastelua, 
yksinkertaisen koordinaatiston piirtämistä (tekstikäyttöliittymässä) sekä monimutkaisempia laskutoimituksia.