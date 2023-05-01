package com.mycompany.tparreglos;

public class PruebaArreglo {
    public static void main(String[] args) {
        int[] arregloDeEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 10};
         
        int[][] arregloDeEnteros2 = {{12, 31}, {1, 3, 5}};
        String vocales = "Texto de ejemplo";

        Arreglo.sumarLista(arregloDeEnteros);

        System.out.println("El mayor numero del arreglo es " + Arreglo.buscarMayor(arregloDeEnteros2));

        System.out.println("El string " + vocales + " tiene " + Arreglo.cuentaVocales(vocales) + " vocales");

        System.out.println("El string " + vocales + " tiene " + Arreglo.cuentaCaracter(vocales, 'r') + " veces el caracter r");
    }
    
}