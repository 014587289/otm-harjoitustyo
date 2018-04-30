# Arkkitehtuurikuvaus

## Rakenne

Ohjelman rakenne on yksinkertainen, koska suurin osa sovelluksen toiminnasta tapahtuu yhdess� tai kahdessa luokassa. T�st� syyst�
sovelluksen pakkausrakenne jakautuu vain testipakkaukseen sek� sovelluslogiikan sis�lt�viin pakkauksiin.

## K�ytt�liittym�

Tekstik�ytt�liittym� antaa ohjeet inputtien sy�tt�miseen ja kertoo, jos input on v��r�nlaista. Sovelluksen k�ynnistyess� k�ytt�j� valitsee tekstivalikosta, 
mit� h�n haluaa sovelluksen tekev�n, ja k�ytt�liittym� etenee sen mukaisesti.

Kun laskutoimitus on suoritettu, palaa k�ytt�liittym� aina takaisin alkuun, jolloin k�ytt�j� voi laskea useita laskutoimituksia 
tai tarkastella laskuhistoriaansa k�ynnist�m�tt� ohjelmaa uusiksi.

## Sovelluslogiikka

Sovelluksen t�rkeimm�t luokat ovat Calculator sek� Operator, joista ensimm�inen on vastuussa sovelluslogiikan sek� k�ytt�liittym�n rakentamisesta.
Operator-luokka taas vastaa laskutoimitusten suorittamisesta ja tulosten tallettamisesta.

Sovellukseen kuuluu my�s main-luokka, jonka vastuulla on Calculator-olion luominen ja sen k�ynnist�minen.

Yksinkertainen sovellusta kuvaava luokkakaavio:

<img src="http://yuml.me/446352b4.png" width="450">

## Tietojen pysyv�istallennus

K�ytt�j�n tekem�t laskutoimitukset tallennetaan tekstitiedostoon, ja niit� voi tarkastella tulostamalla laskuhistorian k�ytt�liittym�st� l�ytyv�n toiminnallisuuden avulla.
K�ytt�liittym� tarjoaa my�s mahdollisuuden historian tyhjent�miseen.

Tekstitiedostosta l�ytyv�t laskutoimitukset ovat merkkijonoja, muotoa esimerkiksi "3 + 4 = 7" tai "sin(0) = 0".

## P��toiminnallisuus

Sovelluksen perustoiminnallisuutta kuvaava sekvenssikaavio:

<img src="https://www.websequencediagrams.com/cgi-bin/cdraw?lz=VGl0bGUgQ2FsY3VsYXRvciAtIHN1bW1hbiBsYXNrZW1pbmVuIGFuc2lhIGvDpHl0dMOkZW4KCk1haW4tPgAtCjogY2FsYyA9IG5ldwBDCygpABMXLnN0YXJ0ABwNAHoKLT5PcGVyAFEGb3ByAE8HAAwIABwPU2Nhbm5lcjogc2NuAHkHAAwHABEYZmlyc3RJbnB1dCA9IHNjbi5uZXh0TGluZSgpICgiMyIASBhlY29uZAAfGTUiKQoAgS0Xc3VtKABrCiwAPgspCgCBYggtAIJADjgAMBthbnMsIDEwKTsAghkaLmdldExhc3RSZXN1bHQoADI1OABgBQCBCRgxOAoKCgo&s=napkin" width="450">

## Ohjelman rakenteeseen j��neet heikkoudet

### K�ytt�liittym�n eriytt�minen

K�ytt�liittym� ja sovelluslogiikka toimivat l�hes kokonaan yhden luokan yhden metodin varassa. My�s tietojen pysyv�istallennus hoidetaan t�m�n metodin sis�ll�.
N�it� asioita voisi eriytt�� omiksi luokikseen.

### Tallennus

Koodista l�ytyy my�s jonkin verran toistoa, sill� tiedoston k�sittely Javalla on aika vierasta, joten ainoa tapa luoda tiedosto ja k�sitell� sit� on varsin k�mpel�.