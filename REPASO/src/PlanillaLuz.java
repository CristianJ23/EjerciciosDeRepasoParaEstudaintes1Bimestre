
import java.util.Scanner;
/**
 /*Reto: Desarrolla un programa en Java que calcule el valor total a pagar por una planilla de luz.
    Instrucciones:
Pide al usuario que ingrese el costo por kilovatio/hora (un número decimal).
Pide al usuario que ingrese el número de kilovatios consumidos en el mes (un número entero).
Calcula el valor a pagar usando la fórmula: Total = Costo por Kilovatio * Kilovatios Consumidos
Muestra en pantalla el valor total a cancelar.*/
public class PlanillaLuz {
     public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
         double costo, total;
         int consumo;
         System.out.println("Ingrese el costo por kilovatio/hora");
         costo = tcl.nextDouble();
         System.out.println("Ingrese el número de kilovatios consumidos en el mes");
         consumo = tcl.nextInt();
         
         total = (costo * consumo);
         
         System.out.println("Su total a pagar es:" + total);
           
    }
}
/**
 * run:
Ingrese el costo por kilovatio/hora
5,50
Ingrese el n�mero de kilovatios consumidos en el mes
96
Su total a pagar es:528.0
BUILD SUCCESSFUL (total time: 17 seconds)
 */