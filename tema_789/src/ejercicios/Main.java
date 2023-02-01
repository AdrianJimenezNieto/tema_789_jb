package ejercicios;

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
    // metodo main
    public static void main(String[] args) {
        // ejercicio 1 (mostrar vector string)
        String[] palabras = {"hola mundo", "que tal", "teclado", "cafe"};
        ejercicio_1(palabras);
        System.out.println();

        // ejercicio 2 (matriz de enteros)
        int[][] matriz = {{1,5,7},{25,57,14},{101,4,85}};
        ejercicio_2(matriz);
        
        // ejercicio 3 (eliminar posiciones 2ª y 3ª)
    }
}
