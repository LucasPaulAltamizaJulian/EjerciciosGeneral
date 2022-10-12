/*3. Pedir el radio de una circunferencia y calcular su longitud.
 */
package com.mycompany.s5;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E3 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r=sc.nextDouble();
        l=2*Math.PI*r;
        
        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
