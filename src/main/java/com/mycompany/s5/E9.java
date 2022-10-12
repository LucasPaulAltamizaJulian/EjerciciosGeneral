/*9. Pedir dos números y mostrarlos ordenados de mayor a menor.
*/
package com.mycompany.s5;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2=sc.nextInt();
        
        if(n1>n2)
            System.out.println(n1 + " y " + n2);
        else
            System.out.println(n2 + " y " + n1);
    }
}
