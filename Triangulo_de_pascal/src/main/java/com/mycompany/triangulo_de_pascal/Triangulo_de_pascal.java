/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulo_de_pascal;
import java.util.*;
public class Triangulo_de_pascal {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n,f;
        System.out.print("Ingrese el numero de filas: ");
        f = sc.nextInt();  
        
        for(int i =0;i<f;i++) {
            n = 1;
            System.out.printf("%"+(f-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",n);
                n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
