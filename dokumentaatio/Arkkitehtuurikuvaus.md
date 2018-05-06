# Arkkitehtuurikuvaus

## Rakenne

Sovelluksen pakkausrakenne jakautuu testipakkauksiin ja sovelluksen toiminnan sis�lt�viin pakkauksiin, joita on kaksi. Toisessa k�sitell��n sovellusken k�ynnist�minen 
sek� k�ytt�liittym�, ja toisesta l�ytyy sovelluslogiikan toteuttavat luokat. Ohjelman rakenne on t�st� syyst� varsin yksinkertainen.

## K�ytt�liittym�

Tekstik�ytt�liittym� antaa ohjeet inputtien sy�tt�miseen ja kertoo, jos input on v��r�nlaista. Sovelluksen k�ynnistyess� k�ytt�j� valitsee tekstivalikosta, 
mit� h�n haluaa sovelluksen tekev�n, ja k�ytt�liittym� etenee sen mukaisesti.

Kun laskutoimitus on suoritettu, palaa k�ytt�liittym� aina takaisin alkuun, jolloin k�ytt�j� voi laskea useita laskutoimituksia 
tai tarkastella laskuhistoriaansa k�ynnist�m�tt� ohjelmaa uusiksi.

## Sovelluslogiikka

Sovelluksen t�rkeimm�t luokat ovat Calculator, Inputter sek� Operator.

Calculator on k�ytt�liittym�luokka, jota k�ytet��n k�ytt�j�n ohjeistamiseen inputtien antamisessa 
sek� laskutoimitusten tulosten tulostamiseen.

Inputter ottaa vastaan k�ytt�j�n sy�tt�m�t inputit ja varmistaa, ett� ne ovat oikean tyylisi�. Esimerkiksi lukua pyydett�ess� Inputter pit�� huolen, ettei k�ytt�j� sy�t� 
merkkijonoja inputtina. Tarkistetut inputit siirret��n luokan Operator oliolle, joka suorittaa laskutoimitukset ja antaa k�ytt�liittym�lle tiedon tulostettavista tuloksista.

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

K�ytt�liittym� sek� sy�tteiden vastaanotto ja k�sittely on eriytetty toisistaan, mutta tiedostoon kirjoittaminen ja sen tarkastelu on edelleen k�ytt�liittym�luokan vastuulla. 
T�m�n voisi eriytt�� k�ytt�liittym�st� selke�mm�n sovellusrakenteen takaamiseksi.

### Tallennus

Koodista l�ytyy jonkin verran toistoa, sill� tiedoston k�sittely Javalla on aika vierasta, joten ainoa tuntemani tapa luoda tiedosto ja k�sitell� sit� on varsin k�mpel�.

### Toiminnallisuuden laajentaminen

Sovelluksen toiminnallisuus on suppeahko. Jos aikaa jatkokehitykseen olisi, voisi laskimeen lis�t� toiminnallisuutta kuten funktioiden tarkastelua, 
yksinkertaisen koordinaatiston piirt�mist� (tekstik�ytt�liittym�ss�) sek� monimutkaisempia laskutoimituksia.