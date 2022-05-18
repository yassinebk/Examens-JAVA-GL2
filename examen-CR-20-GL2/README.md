# Examen CR 20 RT2

## Exercice 1

1. Exception sont des erreurs qui pousse le programme a sortir de son flow d'execution normale et sont elevees lors de presence d'un erreur ou action interdite. La classe `Exception` est la classe parente de tous les exceptions et sont crees `new Exception(message)`. pour traiter une exception il faut entourer le code qui peut creer l'exception par `try{}` et `catch{}`

2. `throws` pour dire qu'une fonction eleve une exception en specifiant le type d'exception `FUNCTION_SCOPE RETURN_VALUE FUNCTION_NAME(ARGS) throws EXCEPTION_CLASS`
`throw` pour creer une exception `throw new Exception()`
`finally` bout de code qui va s'executer dans les deux cas ou il'y a eu une exception ou non.

3. Oui le code genere des problemes. Il faut ajouter du code qui va generer l'exception

```java
class MyRiskyClass{
    public void myMethod(){
        
            FileReader in =null;
        try{
            in  = new FileReader(src);


        }
        catch(IOException ex){

        }
        catch (Exception e ){ 
            //traite le code
        }
    }
}

```

## Exercice 2

- L'assertion est un petit test sur une condition. si la condition n'est pas validee un erreur de type AssertionError sera elevee qu'on peut traiter avec catch(Error error){}

## Exercice 3

- Le Garbage collector sert a supprimer les objets qu'on ne peut plus acceder dans notre programme du memoire. (ex: `object= null`) On fait appeler au garbage collector avec `System.gc()`

- La methode finalize est la methode appelee pour la destruction d'un objet. On peut ajouter le bout de code Sytstem.gc() dans cette methode ou informer d'autres entitees que notre objet sera detruite.

## Exercice 4

- Les **Wrappers** sont des classes qui remplace les types primitives et offrent des methodes et des attributes qui rendent leurs utilisation plus facile.

- **Polymorphisme**  Le fait qu'une objet de classe fille peut etre traite comme l'objet de classe parente  lors de l'execution du programme et que les classes filles peuvent surcharger les methodes heriter de classes parentes.

## Exercice 5

- Les blocs statics des classes ( et meme herittees ) sont executes de classe de parente vers la classe fille. Pour chaque classe les blocs de constructor sont executes apres les blocs d'initialisation.

> (StaticParent1 > StaticChild1-> InitiParent1->ConstructParent1->InitChild1->ConstructChild1)
