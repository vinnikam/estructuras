package ejercicioleercadena.pq1;

public class Operaciones {
    private String[][] contenido;
    private final int COLUMNA = 10;
    public Operaciones() {
        this.contenido = new String[26][10];
        this.iniciarMatriz();
    }
    public String[] converStringtoArray(String cadena){
        String[] lacadena = cadena.split("");
        return lacadena;
    }
    public void procesar(String[] cadena){

    }
    public void generarTotales(){
        
    }
    public void imprimir(){
        System.out.println("Listado de resultados ");
        for (int i = 0; i < contenido.length; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (this.contenido[i][j] == null)
                    System.out.print("\t");
                else
                    System.out.print(this.contenido[i][j]+"\t");
            }
            System.out.println();
            
        }
    }
    private void iniciarMatriz(){
       int ascii = 97;
        for (int i = 0; i < contenido.length; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (j == 0)
                    this.contenido[i][j] = "["+(char)(ascii++)+"]";
                else if (j == COLUMNA-1)
                    this.contenido[i][j] = "0";
                
            }
        }

    }

}
