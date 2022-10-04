/*4. Pedir dos números y decir si son iguales o no.
*/
package com.mycompany.s5;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class E4 {
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc="comment">
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=sc.nextInt();
        System.out.print("Introduce otro número: ");
        n2=sc.nextInt();
        if(n1==n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
//</editor-fold>
    }
}
