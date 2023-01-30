import java.text.DecimalFormat;
import java.math.*;
public class Main {
    static double CalcularIva (double precio) {
        return precio * 1.21;
    }
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        double precio = 28;
        double precio_con_iva = CalcularIva(precio);
        System.out.println("El precio original era de " + precio +
                "€, el precio con el IVA incluido es de " + df.format(precio_con_iva) + "€.");
    }
}