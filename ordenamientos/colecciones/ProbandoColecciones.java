import java.util.Scanner;
import ordenamientos.Persona;

public class ProbandoColecciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. Pila");
        System.out.println(" 2. Fila");
        System.out.println(" 3. Lista Encadenada");
        System.out.print(" Opcion ? ");
        int opcion = sc.nextInt();
        Persona p = new Persona(123, "Juan Ito");
        Persona p1 = new Persona(458, "Luan Ito");
        Persona p2 = new Persona(8745, "Trayect Ito");
        Persona p3 = new Persona(2568, "Gestor Ito");
        Persona p4 = new Persona(7458, "Lito Ito");

        if (opcion == 1){
            GestorPila gestor = new GestorPila();
            gestor.adicionar(p);
            gestor.imprimir();
            gestor.adicionar(p1);
            gestor.imprimir();
            gestor.adicionar(p2);
            gestor.imprimir();
            gestor.adicionar(p3);
            gestor.imprimir();
            gestor.adicionar(p4);
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();

        }else if (opcion == 2){
            GestorCola gestor = new GestorCola();
            gestor.adicionar(p);
            gestor.adicionar(p1);
            gestor.imprimir();
            gestor.adicionar(p2);
            gestor.adicionar(p3);
            gestor.imprimir();
            gestor.adicionar(p4);
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            
        }else if (opcion == 3){
            GestorLIstaEncadenada gestor = new GestorLIstaEncadenada();
            gestor.adicionar(p);
            gestor.adicionar(p1);
            gestor.imprimir();
            gestor.adicionar(p2);
            gestor.adicionar(p3);
            gestor.imprimir();
            gestor.adicionar(p4);
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
            System.out.println(" Retira -------------------- ");
            gestor.retirar();
            gestor.imprimir();
        }
    }
}
