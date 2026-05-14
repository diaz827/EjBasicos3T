package EjBasicos3T.Semana4.Ej3;

import java.util.Scanner;

/*
Crea una clase Figura con:
- atributo nombre
- métod calcularArea() (puede devolver 0 por defecto)

Crea dos clases:
- Cuadrado
- Círculo
Ambas deben heredar de Figura

A cada una de estas clases le tienes que crear su constructor; por ejemplo, para construir un cuadrado necesitamos saber su "lado", y para construir un círculo necesitamos saber su "radio".

También, tienes que sobreescribir el métod "calcularArea()" y que cada figura la calcule como necesitaría.
el cuadrado usa lado
el rectángulo usa base y altura
 */
public class Ej3 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Como se llama el cuadrado?");
        String nomCuadrado = sc.next();
        System.out.println("\nCuanto mide el lado?");
        double lado = sc.nextDouble();

        System.out.println("Como se llama el cuadrado?");
        String nomCirculo = sc.next();
        System.out.println("\nCuanto mide el radio?");
        double radio = sc.nextDouble();

        Cuadrado Cu =  new Cuadrado(nomCuadrado,lado);
        Circulo Ci = new Circulo(nomCirculo,radio);

        System.out.println("\nCalculo del area del Cuadrado " + Cu.calcularArea());
        System.out.println("\nCalculo del area del Circulo " + Ci.calcularArea());
    }
}
