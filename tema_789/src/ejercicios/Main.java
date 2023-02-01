package ejercicios;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    // ejercicio 1 (mostrar vector string)
    public static void Ejercicio_1(String[] vector_cadenas){
        for (int i = 0 ; i < vector_cadenas.length ; i ++){
            // Recorro el vector con un indice que va incrementando 1 a 1
            System.out.println(vector_cadenas[i]);
        }
    }

    // ejercicio 2 (matriz de enteros)
    public static void Ejercicio_2(int[][] matriz){
        // recorro la matriz con dos bucles for, en las filas y columnas
        for (int fila = 0 ; fila < matriz.length ; fila++ ){
            for (int columna = 0 ; columna < matriz.length ; columna++ ){
                System.out.println("Estamos en la posicion: Fila-> " + fila +
                        " // Columna-> " + columna + " // Valor-> " + matriz[fila][columna]);
            }
        }
    }

    // ejercicio 3 (eliminar posiciones 2ª y 3ª)
    public static void Ejercicio_3(Vector<Double> vector){
        System.out.println("Vector con todos los elementos: " + vector);
        vector.remove(2);
        vector.remove(2);// hago la misma operacion porque la posicion 3 ahora es la 2
        System.out.println("Vector tras los cambios: " + vector);
    }
    // ejercicio 5 (arraylist)
    public static void Ejercicio_5(ArrayList<String> arraylist, LinkedList<String> linkedlist){
        // recorro arraylist
        System.out.println("Elementos ArrayList:");
        for (int i = 0; i<arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
        // recorro linkedlist
        System.out.println("Elementos LinkedList:");
        for (int i = 0; i<linkedlist.size(); i++){
            System.out.println(linkedlist.get(i));
        }
    }
    // ejercicio 6 (arrayList de enteros)
    public static void Ejercicio_6 (ArrayList<Integer> enteros){
        // relleno el arraylist
        for (int i = 0; i <= 9; i++){
            enteros.add(i+1);
        }
        System.out.println("ArrayList antes de eliminar los pares");
        System.out.println(enteros);
        // elimino los numeros pares del arraylist
        ArrayList<Integer> paresEliminados = new ArrayList<>();
        for (int i = 0; i < enteros.size(); i++){
            if (enteros.get(i) % 2 != 0){
                paresEliminados.add(enteros.get(i));
            }
        }
        System.out.println("ArrayList despues de eliminar los pares");
        System.out.println(paresEliminados);
    }

    // ejercicio 7 (divide por cero)
    public static void DividePorCero (int dividendo) throws ArithmeticException {
        int a;
        try {
            a = dividendo / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        System.out.println("Demo de codigo.");
    }

    // ejercicio 8 (InputStream PrintStream)
    public static void Ejercicio_8(InputStream fileIn, PrintStream fileOut){
        try{
            byte[] datos = fileIn.readAllBytes();
            fileOut.writeBytes(datos);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    // metodo main
    public static void main(String[] args) {
        // ejercicio 1 (mostrar vector string)
        String[] palabras = {"hola mundo", "que tal", "teclado", "cafe"};
        Ejercicio_1(palabras);
        System.out.println();

        // ejercicio 2 (matriz de enteros)
        int[][] matriz = {{1,5,7},{25,57,14},{101,4,85}};
        Ejercicio_2(matriz);
        System.out.println();

        // ejercicio 3 (eliminar posiciones 2ª y 3ª)
        Vector<Double> vector = new Vector();
        vector.add(5.78);
        vector.add(3.14);
        vector.add(74.21);
        vector.add(8.3);
        vector.add(4.00);
        vector.add(72.21);
        Ejercicio_3(vector);
        System.out.println();

        // ejercicio 4:
        /* El principal problema de utilizar un vector con la capacidad por defecto
        es que cuando desbordemos el vector se va a ir doblando, costando memoria.
        Así, empezará en 10, seguirá con 20, luego 40, después 80, hasta llegar a tener
        160 elementos de capacidad, cuando solo necesitamos 100 (sobran 60).
        */

        // ejercicio 5 (arraylist)
        ArrayList<String> coches = new ArrayList<>(); // creo el arraylist
        coches.add("Dacia");
        coches.add("Citroen");
        coches.add("Renault");
        coches.add("Mercedes");
        // vuelco los datos a una linkedlist
        LinkedList<String> linkedCoches = new LinkedList<>(coches);
        Ejercicio_5(coches, linkedCoches);

        // ejercicio 6 (arrayList de enteros)
        ArrayList<Integer> enteros = new ArrayList<>();
        Ejercicio_6(enteros);
        System.out.println();

        // ejercicio 7 (divide por cero)
        int dividendo = 5;
        try{
            DividePorCero(dividendo);
        } catch (Exception e){
            System.out.println("Esto no se puede hacer.");
        } finally {
            System.out.println("Demo de codigo.");
        }
        System.out.println();

        // ejercicio 8 (InputStream PrintStream)
        try{
            InputStream loremipsum = new FileInputStream("ficheros/loremipsum.txt");
            PrintStream loremipsum_copia = new PrintStream("ficheros/copia_loremipsum.txt");
            Ejercicio_8(loremipsum, loremipsum_copia);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
