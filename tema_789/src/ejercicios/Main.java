package ejercicios;
import java.util.Vector;

public class Main {
    // ejercicio 1 (mostrar vector string)
    public static void ejercicio_1(String[] vector_cadenas){
        for (int i = 0 ; i < vector_cadenas.length ; i ++){
            // Recorro el vector con un indice que va incrementando 1 a 1
            System.out.println(vector_cadenas[i]);
        }
    }

    // ejercicio 2 (matriz de enteros)
    public static void ejercicio_2(int[][] matriz){
        // recorro la matriz con dos bucles for, en las filas y columnas
        for (int fila = 0 ; fila < matriz.length ; fila++ ){
            for (int columna = 0 ; columna < matriz.length ; columna++ ){
                System.out.println("Estamos en la posicion: Fila-> " + fila +
                        " // Columna-> " + columna + " // Valor-> " + matriz[fila][columna]);
            }
        }
    }

    // ejercicio 3 (eliminar posiciones 2ª y 3ª)
    public static void ejercicio_3(Vector<Double> vector){
        System.out.println("Vector con todos los elementos: " + vector);
        vector.remove(2);
        vector.remove(2);// hago la misma operacion porque la posicion 3 ahora es la 2
        System.out.println("Vector tras los cambios: " + vector);
    }
    // metodo main
    public static void main(String[] args) {
        // ejercicio 1 (mostrar vector string)
        String[] palabras = {"hola mundo", "que tal", "teclado", "cafe"};
        ejercicio_1(palabras);
        System.out.println();

        // ejercicio 2 (matriz de enteros)
        int[][] matriz = {{1,5,7},{25,57,14},{101,4,85}};
        ejercicio_2(matriz);
        System.out.println();

        // ejercicio 3 (eliminar posiciones 2ª y 3ª)
        Vector<Double> vector = new Vector();
        vector.add(5.78);
        vector.add(3.14);
        vector.add(74.21);
        vector.add(8.3);
        vector.add(4.00);
        vector.add(72.21);
        ejercicio_3(vector);

        // ejercicio 4:
        /* El principal problema de utilizar un vector con la capacidad por defecto
        es que cuando desbordemos el vector se va a ir doblando, costando memoria.
        Así, empezará en 1, seguirá con 2, luego 4, después 8, hasta llegar a tener
        128 elementos de capacidad, cuando solo necesitamos 100 (sobran 28).
        */

        
    }
}
