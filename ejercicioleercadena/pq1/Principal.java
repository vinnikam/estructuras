package ejercicioleercadena.pq1;

import java.util.Scanner;

/**
 * author : Vinni. 
 * email: vinni_@yahoo.com
 */

 public class Principal {
    public static void main(String[] args) {
        System.out.println(" PROGRAMA DE LEER CADENA");

        Principal principal = new Principal();
        String cadenaLeida = principal.leerCadena("Digite una cadena");
        Operaciones operaciones = new Operaciones();
        String[] cadenaArr =  operaciones.converStringtoArray(cadenaLeida);
        if (cadenaArr != null){
            operaciones.procesar(cadenaArr);
            operaciones.generarTotales();
            operaciones.imprimir();
        }else
            System.out.println("La cadena es null");
        System.out.println("Fin - - - -- - - - - - ");

    }
    public String leerCadena(String mensaje ){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje+" :");
        String cadena = scanner.nextLine();
        scanner.close();
        return cadena;
    }
}


