package com.mycompany.ciclo_for;

import java.util.Scanner;

public class Ciclo_for {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("PRIMER CAMBIO ");
       
        System.out.println("Cantidad de repeticion ");
        int can = entrada.nextInt();
        
        for (int i = 1; i <= can; i++) {
            System.out.println("Dato numero "+i);
        }
       
        
    }
}
