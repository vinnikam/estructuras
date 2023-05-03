package ordenamientos;

import java.io.IOException;
import java.util.Scanner;

public class Recursivos{
    public static void main(String[] args) {
        ejecutarPotentic();
        ejecutarMcd();
        /*try {
            ejecutarNumReves();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
    public static void ejecutarPotentic(){
        System.out.println(" Potencia recursiva ");
        Scanner in = new Scanner(System.in);
        int n;
        double x;
        System.out.print("Valor de x : ");
        x = in.nextDouble();
        do {
        System.out.print("valor de n : ");
        n = in.nextInt();
        } while (n <= 0);
        System.out.println(x + " elevado a la " + n + " es igual a " + potencia(x, n));    
        in.close();    
    }
    public static double potencia(double x, double n) {
        if (n == 0) {
        return 1;
        } else {
        return x * potencia(x, n - 1);
        }
    }
    public static void ejecutarMcd(){
        //18/24
        System.out.println(" MDC ");
        Scanner in = new Scanner(System.in);
        int x, y;
        do {
        System.out.print("Ingrese primer numero :");
        x = in.nextInt();
        } while (x <= 0);
        do {
        System.out.print("Ingrese segundo numero :");
        y = in.nextInt();
        } while (y <= 0);
        System.out.println("El mcd de " + x + " y " + y + " es : " + mcd(x, y));
        in.close();    

    }
    public static int mcd(int a, int b) {
        if (a % b == 0) {
        return b;
        } else {
        return mcd(b, a % b);
        }
    }
    public static void ejecutarNumReves() throws IOException{
        Scanner in = new Scanner(System.in);
        int num;
        
        do {
        System.out.print("Ingrese numero :");
        num = in.nextInt();
        } while (num <= 0);
        System.out.print("Numero al reves :");
        reves(num);
        System.out.println();
        in.close();    
                
    }
    public static void reves(int n) {
        System.out.print(n % 10);
        if (n / 10 != 0) {
        reves(n / 10);
        }
    }
}