
import java.util.Scanner;
/**
/*Reto: Desarrolla un programa en Java que calcule el precio final de una compra 
   aplicando un descuento condicional.
Instrucciones:
Pide al usuario que ingrese el precio original del producto (un número decimal).

Si el precio original es mayor a $100, aplica un descuento del 10%.

Si el precio es $100 o menor, no se aplica ningún descuento.

Calcula y muestra: el monto del descuento aplicado y el precio final a pagar.
 * @author Emily Rivera
 */
public class Descuentocompra {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double precio, descuento, totalpago;
        
        System.out.println("Ingrese el precio original del producto");
        precio = tcl.nextDouble();
        
        if (precio > 100) {
            descuento = (precio * 0.10);
            totalpago = (precio - descuento);
            System.out.printf("Se le ha acreditado un descuento del 10 \n El total a pagar es: %.2f", totalpago);
        } 
        else {
            System.out.println("No se aplica ningún descuento" + precio);    
        }   
    }
}
