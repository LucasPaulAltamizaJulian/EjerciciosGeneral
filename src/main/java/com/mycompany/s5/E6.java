/*6. Pedir dos números y decir si uno es múltiplo del otro.
 */
package com.mycompany.s5;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E6 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2=sc.nextInt();
        if(n1%n2==0)
            System.out.println("Son múltiplos");
        else
            System.out.println("No son múltiplos");

    }
}
