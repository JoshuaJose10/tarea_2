package com.mycompany.triangulo_de_pascal;
import java.util.*;
public class Triangulo_de_pascal {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int numero,filas;
        System.out.print("Ingrese el numero de filas: ");
        filas = sc.nextInt();  
        
        for(int i =0;i<filas;i++) {
            numero = 1;
            System.out.printf("%"+(filas-i)*2+"s","");
            for(int j=0;j<=i;j++) {
                System.out.format("%4d",numero);
                numero = numero * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
