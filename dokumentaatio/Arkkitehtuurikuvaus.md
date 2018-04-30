# Arkkitehtuurikuvaus

## Rakenne

Ohjelman rakenne on yksinkertainen, koska suurin osa sovelluksen toiminnasta tapahtuu yhdessä tai kahdessa luokassa. Tästä syystä
sovelluksen pakkausrakenne jakautuu vain testipakkaukseen sekä sovelluslogiikan sisältäviin pakkauksiin.

## Käyttöliittymä

Tekstikäyttöliittymä antaa ohjeet inputtien syöttämiseen ja kertoo, jos input on vääränlaista. Sovelluksen käynnistyessä käyttäjä valitsee tekstivalikosta, 
mitä hän haluaa sovelluksen tekevän, ja käyttöliittymä etenee sen mukaisesti.

Kun laskutoimitus on suoritettu, palaa käyttöliittymä aina takaisin alkuun, jolloin käyttäjä voi laskea useita laskutoimituksia 
tai tarkastella laskuhistoriaansa käynnistämättä ohjelmaa uusiksi.

## Sovelluslogiikka

Sovelluksen tärkeimmät luokat ovat Calculator sekä Operator, joista ensimmäinen on vastuussa sovelluslogiikan sekä käyttöliittymän rakentamisesta.
Operator-luokka taas vastaa laskutoimitusten suorittamisesta ja tulosten tallettamisesta.

Sovellukseen kuuluu myös main-luokka, jonka vastuulla on Calculator-olion luominen ja sen käynnistäminen.

Yksinkertainen sovellusta kuvaava luokkakaavio:

<img src="http://yuml.me/446352b4.png" width="450">

## Tietojen pysyväistallennus

Käyttäjän tekemät laskutoimitukset tallennetaan tekstitiedostoon, ja niitä voi tarkastella tulostamalla laskuhistorian käyttöliittymästä löytyvän toiminnallisuuden avulla.
Käyttöliittymä tarjoaa myös mahdollisuuden historian tyhjentämiseen.

Tekstitiedostosta löytyvät laskutoimitukset ovat merkkijonoja, muotoa esimerkiksi "3 + 4 = 7" tai "sin(0) = 0".

## Päätoiminnallisuus

Sovelluksen perustoiminnallisuutta kuvaava sekvenssikaavio:

<img src="https://www.websequencediagrams.com/cgi-bin/cdraw?lz=VGl0bGUgQ2FsY3VsYXRvciAtIHN1bW1hbiBsYXNrZW1pbmVuIGFuc2lhIGvDpHl0dMOkZW4KCk1haW4tPgAtCjogY2FsYyA9IG5ldwBDCygpABMXLnN0YXJ0ABwNAHoKLT5PcGVyAFEGb3ByAE8HAAwIABwPU2Nhbm5lcjogc2NuAHkHAAwHABEYZmlyc3RJbnB1dCA9IHNjbi5uZXh0TGluZSgpICgiMyIASBhlY29uZAAfGTUiKQoAgS0Xc3VtKABrCiwAPgspCgCBYggtAIJADjgAMBthbnMsIDEwKTsAghkaLmdldExhc3RSZXN1bHQoADI1OABgBQCBCRgxOAoKCgo&s=napkin" width="450">

## Ohjelman rakenteeseen jääneet heikkoudet

### Käyttöliittymän eriyttäminen

Käyttöliittymä ja sovelluslogiikka toimivat lähes kokonaan yhden luokan yhden metodin varassa. Myös tietojen pysyväistallennus hoidetaan tämän metodin sisällä.
Näitä asioita voisi eriyttää omiksi luokikseen.

### Tallennus

Koodista löytyy myös jonkin verran toistoa, sillä tiedoston käsittely Javalla on aika vierasta, joten ainoa tapa luoda tiedosto ja käsitellä sitä on varsin kömpelö.