package EjBasicos3T.Semana4.Ej2;

/*
Ejercicio 2:

Crea una clase Personaje que tenga los atributos nombre y ataque. Crea un métod "atacar()"
que devuelva cuánto daño hace (devuelve su ataque).

Crea una clase Guerrero y una clase Mago que hereden de Personaje.
El objetivo de esta distinción es que los Guerreros pueden hacer daño crítico,
o sea, el 10% de las veces su métod "atacar()" devuelve el doble del ataque,
y que los magos hacen dañosaleatorios alrededor de su poder de ataque,
haciendo siempre entre un 20% menos y más de su poder de ataque.

Por ejemplo:
un Personaje con ataque 100, hará siempre 100 de daño.
Un Guerrero con ataque 100 hará 100 de daño, pero un 10% de las veces hará 100*2
Un mago con ataque 100 hará siempre un valor aleatorio entre 80 y 120 de daño.


Crea un main, crea varios personajes/guerrero/mago, y prueba a imprimir el valor de sus ataques 10 veces.

IMPORTANTE:

Las clases hijas NO pueden acceder a la variable ataque directamente.
En lugar de eso, tienen que recuperar el valor que les dé el métod "atacar()"
de la clase padre y aplicarle los modificadores que correspondan;
en el caso del guerrero, también tendrá que imprimir por pantalla si hace crítico.
 */

public class Ej2 {
}
