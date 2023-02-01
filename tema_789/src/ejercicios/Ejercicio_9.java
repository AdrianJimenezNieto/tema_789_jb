package ejercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* en esta clase desarrollare el programa propuesto en el ejercicio 9
*
* creare un programa al que se le introduzca un fichero con nombres de coches
* otro fichero con una lista de precios para esos coches e imprima un tercer
* fichero donde se encontraran los coches con su precio al lado
*/
public class Ejercicio_9 {

    // funcion para leer el fichero coches y meterlo en un arraylist
    public static ArrayList<String> leo_coches (InputStream fichero){
        ArrayList<String> coches = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(fichero, "UTF-8"));
            String linea = br.readLine();
            while(linea != null) {
                coches.add(linea);
                linea = br.readLine();
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
        return coches;
    }

    // funcion para leer el fichero precios y meterlo en un arraylist
    public static ArrayList<Integer> leo_precios (InputStream fichero){
        ArrayList<Integer> precios = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(fichero, "UTF-8"));
            String linea = br.readLine();
            while(linea != null) {
                precios.add(Integer.parseInt(linea));
                linea = br.readLine();
            }
        } catch (Exception e ){
            e.printStackTrace();
        }
        return precios;
    }

    // funcion para volcar los datos al fichero nuevo
    public static void volcado_datos(Map<Integer, String> coches, Map<Integer, Integer> precios, PrintStream fileOut){
        try{
            for (int i = 0; i<coches.size(); i++){
                fileOut.println("El coche " + coches.get(i) + " cuesta " + precios.get(i) + "€.");
            }
            System.out.println("El volcado de datos se ha realizado correctamente.");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // creo los inputstream y el printsream
        try{
            InputStream coches = new FileInputStream("ficheros_coches/coches.txt");
            InputStream precios = new FileInputStream("ficheros_coches/precios.txt");
            PrintStream coches_con_precios = new PrintStream("ficheros_coches/coches_con_precios.txt");

            // creo un hashmap para almacenar los coches y otro para los precios
            Map<Integer, String> coches_map = new HashMap<>();
            Map<Integer, Integer> precios_map = new HashMap<>();

            // creo los arraylist a partir de los ficheros
            ArrayList<String> coches_lista = leo_coches(coches);
            ArrayList<Integer> precios_lista = leo_precios(precios);

            // relleno los hashmap con un id y los datos
            for (int i = 0; i<coches_lista.size();i++){
                coches_map.put(i,coches_lista.get(i));
            }
            for (int i = 0; i<precios_lista.size();i++){
                precios_map.put(i,precios_lista.get(i));
            }

            // vuelco los datos al fichero nuevo con la funcion que me he creado
            volcado_datos(coches_map, precios_map, coches_con_precios);

        }catch(Exception e ){
            e.printStackTrace();
        }

    }
}
