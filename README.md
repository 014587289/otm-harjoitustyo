# Laskin-app

Sovelluksen tarkoituksena on toimia yksinkertaisena tekstikäyttöliittymällä käytettävänä laskimena, jolla käyttäjä voi suorittaa tavanomaisia laskimesta löytyviä operaatioita.

## Dokumentaatio

[Käyttöohje](https://github.com/014587289/otm-harjoitustyo/blob/master/dokumentaatio/Kayttoohje.md)

[Vaatimusmäärittely](https://github.com/014587289/otm-harjoitustyo/blob/master/dokumentaatio/vaatimusm%C3%A4%C3%A4rittely.md)

[Tuntikirjanpito](https://github.com/014587289/otm-harjoitustyo/blob/master/dokumentaatio/Tuntikirjanpito.md)

[Arkkitehtuurikuvaus](https://github.com/014587289/otm-harjoitustyo/blob/master/dokumentaatio/Arkkitehtuurikuvaus.md)

## Releaset

[Viikko 5](https://github.com/014587289/otm-harjoitustyo/releases/tag/0.1)

[Viikko 6](https://github.com/014587289/otm-harjoitustyo/releases/tag/0.3)

[Loppupalautus](https://github.com/014587289/otm-harjoitustyo/releases/tag/1.0)

## Komentorivitoiminnot

### Testaus

Testit voidaan suorittaa komennolla

```
mvn test
```

Testikattavuusraportti voidaan luoda komennolla

```
mvn jacoco:report
```

### jarin generointi

Suoritettava jar voidaan luoda komennolla 

```
mvn package
```

### JavaDoc

JavaDoc voidaan luoda komennolla

```
mvn javadoc:javadoc
```

### Checkstyle
Checkstyle-raportti voidaan luoda komennolla

```
mvn jxr:jxr checkstyle:checkstyle
```




