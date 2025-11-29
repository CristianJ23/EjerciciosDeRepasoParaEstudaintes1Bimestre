

/**
 Concepto Clave: Sentencias Repetitivas (for)
 * Reto: Desarrolla un programa en Java que genere y muestre la tabla
 de multiplicar de un número ingresado por el usuario, desde el 1 hasta el 12.*/
//@author Emily Rivera


import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero, total; 
        int contador = 1;
        
        System.out.println("Ingrese un número del 1 al 12:");
        numero = tcl.nextInt();
        do{
            total = numero * contador;
            System.out.println("RESULT: " + total);
            contador = contador + 1;
        }while (contador <= 12); 
   
}              
}
            
   
  