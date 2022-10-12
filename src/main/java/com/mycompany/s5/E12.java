/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
 */
package com.mycompany.s5;

import java.util.Scanner;


public class E12 {

    public static void main(String[] args) {
        Scanner Entrada=new Scanner(System.in);
        int num;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.nextInt();
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
        // otra forma de hacerlo es
        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);
    }
}
