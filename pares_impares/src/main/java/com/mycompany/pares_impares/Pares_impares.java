/*
Escribir un programa para leer n numeros enteros en el teclado y contar cuantos de ellos son pares y cuantos son impares.
 */

package com.mycompany.pares_impares;
import java.util.*;
public class Pares_impares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,num,par=0;
        System.out.print("Cuantos numeros son:");
        n = sc.nextInt();
        System.out.println("Dame los "+ n + " numeros:");
        i=0;
        while(i<n){
        num = sc.nextInt();
            if (num%2==0) 
                par=par+1;
                i++;
        }
        System.out.printf("Numeros pares = %d, Numeros impares = %d\n",par,(n-par));
    }
}
