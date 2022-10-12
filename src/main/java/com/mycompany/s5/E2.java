/*2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 */
package com.mycompany.s5;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        double a,r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r=sc.nextDouble();
        a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        
        System.out.println("El área de una circunferencia de radio " + r+ " es: " + a);

    }
}
