/*7. Pedir dos números y decir cual es el mayor.
 */
package com.mycompany.s5;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2=sc.nextInt();
        
        // si ambos números son iguales diría que n2 es mayor que n1
        if(n1>n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n2 + " es mayor que " + n1);
    }
}
