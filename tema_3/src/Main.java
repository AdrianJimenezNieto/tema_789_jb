public class Main {
    // creo una funcion que concatene textos de un array de textos (String)
    static String ConcatenaTextoSinEspacios (String [] textos){
        String texto_concatenado = "";

        // Creo el bucle que ira concatenando los textos
        for (int i = 0; i < textos.length; i++){
            texto_concatenado = texto_concatenado + textos[i];
        }
        return texto_concatenado;
    }

    static String ConcatenaTextoConEspacios (String [] textos){
        String texto_concatenado = "";

        // Creo el bucle que ira concatenando los textos
        for (int i = 0; i < textos.length; i++){
            if (i == 0){
                texto_concatenado = texto_concatenado + textos[i];
            }
            else {
                texto_concatenado = texto_concatenado + " " +textos[i];
            }
        }
        return texto_concatenado;
    }
    public static void main(String[] args) {

        // Creo un array de textos
        String [] textos = {"Hola mundo",
        "Que tal??",
        "muy bien",
        "esto es una prueba."};

        System.out.println(ConcatenaTextoSinEspacios(textos));
        System.out.println(ConcatenaTextoConEspacios(textos));

    }

}