public class Main {
    public static class SmartDevice{
        int bateria;
        String marca;
        String nombre;
        int precio;


        // constructor
        public SmartDevice (String marca, String nombre, int precio, int bateria){
            this.marca = marca;
            this.nombre = nombre;
            this.precio = precio;
            this.bateria = bateria;
        }
        public void mostrarSmartDevice(){
            System.out.println("El dispositivo es de la marca: " + marca);
            System.out.println("El dispositivo es el modelo: " + nombre);
            System.out.println("El dispositivo cuesta: " + precio + " €");
            System.out.println("El dispositivo tiene una batria de: " + bateria + " mA.");

        }
    }
    //Clase smartphone hereda de smartdevice
    public static class SmartPhone extends SmartDevice{
        String color;
        int numCamaras;

        // constructor
        public SmartPhone(String marca, String nombre, int precio,
                          int bateria, String color, int numCamaras){
            super(marca, nombre, precio, bateria);
            this.color = color;
            this.numCamaras = numCamaras;
        }

        public void mostrarSmartPhone(){
            System.out.println("El SmartPhone es de la marca: " + marca);
            System.out.println("El SmartPhone es el modelo: " + nombre);
            System.out.println("El SmartPhone cuesta: " + precio + " €");
            System.out.println("El SmartPhone tiene una batria de: " + bateria + " mA.");
            System.out.println("El SmartPhone es de color: " + color);
            System.out.println("El SmartPhone tiene " + numCamaras + " camaras.");
        }
    }

    // clase smartwatch hereda de smartdevice
    public static class SmartWatch extends SmartDevice{
        String color_correa;
        boolean altimetro;
        boolean GPS;

        // constructor
        public SmartWatch(String marca, String nombre, int precio,
                          int bateria, String color_correa, boolean altimetro,
                          boolean GPS){
            super(marca, nombre, precio, bateria);
            this.color_correa = color_correa;
            this.altimetro = altimetro;
            this.GPS = GPS;
        }

        public void mostrarSmartWatch(){
            System.out.println("El SmartWatch es de la marca: " + marca);
            System.out.println("El SmartWatch es el modelo: " + nombre);
            System.out.println("El SmartWatch cuesta: " + precio + " €");
            System.out.println("El SmartWatch tiene una batria de: " + bateria + " mA.");
            System.out.println("El color de la correa es: " + color_correa);
            if (altimetro){
                System.out.println("El SmartWatch TIENE altimetro");
            }
            else{
                System.out.println("El SmartWatch NO TIENE altimetro");
            }
            if (GPS){
                System.out.println("El SmartWatch TIENE GPS.");
            }
            else{
                System.out.println("El SmartWatch NO TIENE GPS.");
            }
        }
    }


    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone("Apple","iPhone",
                1100,2400, "rojo", 3);
        SmartPhone samsung = new SmartPhone("Samsung","Galaxy S",
                25,546, "azul", 18);
        SmartWatch reloj1 = new SmartWatch("samsung","Reloj de lujo",
                2000, 4, "negro", false, true);
        SmartWatch reloj2 = new SmartWatch("samsung","Reloj de lujo 2",
                547, 4, "negro", true, false);
        SmartDevice aspiradora = new SmartDevice("Cecotec", "Conga",
                478, 14577);

        iphone.mostrarSmartDevice();
        System.out.println();
        samsung.mostrarSmartPhone();
        System.out.println();
        reloj1.mostrarSmartWatch();
        System.out.println();
        reloj2.mostrarSmartWatch();
        System.out.println();
        aspiradora.mostrarSmartDevice();
    }
}