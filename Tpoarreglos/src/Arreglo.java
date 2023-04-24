public class Arreglo {

    public Arreglo() {
    }
    public static void sumarLista(int[] arregloUnidimensional){
        int suma = 0;
        for (int i = 0; i < arregloUnidimensional.length; i++){
            suma += arregloUnidimensional[i];
        }
        System.out.println("La suma del arreglo es: " + suma);
        System.out.println("El promedio del arreglo es: " + suma / arregloUnidimensional.length);
    }
    public static int buscarMayor(int[][] arregloBidimensional){
        int mayor = 0;
        for (int i = 0; i < arregloBidimensional.length; i++) {

            for (int j = 0; j < arregloBidimensional[i].length; j++) {

                if (arregloBidimensional[i][j] > mayor) {
                    mayor = arregloBidimensional[i][j];
                }
            }
        }
        return mayor;
    }
    public static int cuentaVocales(String cadena){
        int cantidadDeVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadDeVocales++;
            }
        }
        return cantidadDeVocales;
    }
    public static int cuentaCaracter(String cadena, char caracter){
        int vecesQueAparecioElCaracter = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == caracter) {
                vecesQueAparecioElCaracter++;
            }
        }
        return vecesQueAparecioElCaracter;
    }
}
