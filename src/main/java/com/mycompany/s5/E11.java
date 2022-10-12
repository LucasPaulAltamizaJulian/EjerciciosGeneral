/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
 */
package com.mycompany.s5;

import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {
        int num;
        Scanner Entrada=new Scanner(System.in);
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.nextInt();
        if(num<10)
            System.out.println("tiene 1 cifra");
        else{
            if(num<100)
                System.out.println("tiene 2 cifras");
            else{
                if(num<1000)
                    System.out.println("tiene 3 cifras");
                else{
                    if(num<10000)
                        System.out.println("tiene 4 cifras");
                    else{
                        if(num<100000)
                            System.out.println("tiene 5 cifras");
                    }
                }
            }
        }
    }
}
