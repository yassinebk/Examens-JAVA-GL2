# Examen 2019/2020 Juillet

## Exercice 1

1. [B]
2. [A]
3. [B] `Arbitrary Scopes works in JAVA i was suprised and they are being read from the parent class to child class and the static ones are not being executed`
4. [A]

## Probleme

### Partie 1

3.  Il y aura une erreur de compilation car la class Transport est abstract

4.  `Metro Transport n* NUMERO`

5.

```java
try {

    for(int i=0;i<listStationA.length;i++){
        addStation(listStationA[i]);
    }


}

catch(Exception e){
    e.printStackTrace();
}
try {


    for(int i=0;i<listMetro.length;i++){
        addTransport(listMetro[i]);
    }

}

catch(Exception e){
    e.printStackTrace();
}


```
