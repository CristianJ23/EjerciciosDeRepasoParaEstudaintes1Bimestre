

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
        
        System.out.println("Ingrese un número del para mostrar su tabla:");
        numero = tcl.nextInt();
        do{
            total = numero * contador;
            System.out.println(numero + "*"+contador+ "="+ total);
            contador = contador + 1;
        }while (contador <= 12); 
   
}              
}
/**
 * run:
Ingrese un n�mero del para mostrar su tabla:
9*1=9
9*2=18
9*3=27
9*4=36
9*5=45
9*6=54
9*7=63
9*8=72
9*9=81
9*10=90
9*11=99
9*12=108
BUILD SUCCESSFUL (total time: 10 seconds)

 */