/*1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen,
debe indicarlo.
 */
package com.mycompany.s5;

import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double a,b,c; // coeficientes ax^2+bx+c=0
        double x1,x2,d; // soluciones y determinante
        
        System.out.println("Introduzca primer coeficiente (a):");
        a=sc.nextInt();
        
        System.out.println("Introduzca segundo coeficiente: (b):");
        b=sc.nextInt();
        
        System.out.println("Introduzca tercer coeficiente: (c):");
        c=sc.nextInt();
        
        // calculamos el determinante
        d=((b*b)-4*a*c);
        if(d<0)
            System.out.println("No existen soluciones reales");
        else{
            // queda confirmar que a sea distinto de 0.
            // si a=0 nos encontramos una división por cero.
            
            x1=(-b+Math.sqrt(d))/(2*a);
            x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Solución: " + x1);
            System.out.println("Solución: " + x2);
        }
    }
}
