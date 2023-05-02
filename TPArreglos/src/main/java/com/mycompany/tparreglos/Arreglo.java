package com.mycompany.tparreglos;

public class Arreglo {
    
    public static void sumarLista(int[] lista) {
        int suma = 0;
        double promedio;
        for(int i=0; i<lista.length; i++) {
            suma += lista[i];
        }
        promedio = (double) suma / lista.length;
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
    }
    
    public static int buscarMayor(int[][] arreglo) {
        int mayor = arreglo[0][0];
        for(int i=0; i<arreglo.length; i++) {
            for(int j=0; j<arreglo[i].length; j++) {
                if(arreglo[i][j] > mayor) {
                    mayor = arreglo[i][j];
                }
            }
        }
        return mayor;
    }
    
    public static int cuentaVocales(String cadena) {
        int cuenta = 0;
        String vocales = "aeiouAEIOU";
        for(int i=0; i<cadena.length(); i++) {
            if(vocales.indexOf(cadena.charAt(i)) != -1) {
                cuenta++;
            }
        }
        return cuenta;
    }
    
    public static int cuentaCaracter(String cadena, char caracter) {
        int cuenta = 0;
        for(int i=0; i<cadena.length(); i++) {
            if(cadena.charAt(i) == caracter) {
                cuenta++;
            }
        }
        return cuenta;
    }
}