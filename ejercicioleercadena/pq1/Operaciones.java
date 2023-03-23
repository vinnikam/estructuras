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
        for (String letra : cadena) {
            this.insertar(letra);
        }
    }
    private void insertar(String letra){
        boolean encontro = false;
        int i = 0;
        int posicion = 0;
        do{
            if (this.contenido[i][0].equals(letra.toLowerCase()))
            {
                encontro = true;
                posicion = i;
            }
            i++;
        }while(i<this.contenido.length && !encontro);
        for (int j = 1; j < (COLUMNA-1); j++) {
            if(this.contenido[posicion][j] == null){
                this.contenido[posicion][j] = "X";
                break;
            }
        }
    }
    public void generarTotales(){
        for (int i = 0; i < contenido.length; i++) {
            int total = 0;
            for (int j = 1; j < (COLUMNA-1); j++) {
                if (this.contenido[i][j] != null)
                    total++;
                
            }
            this.contenido[i][COLUMNA-1] = ""+total;
        }
        
    }
    public void imprimir(){
        System.out.println("Listado de resultados ");
        for (int i = 0; i < contenido.length; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (this.contenido[i][j] == null)
                    System.out.print("[] \t");
                else
                    System.out.print(("["+this.contenido[i][j]+"]")+"\t");
            }
            System.out.println();
            
        }
    }
    private void iniciarMatriz(){
       int ascii = 97;
        for (int i = 0; i < contenido.length; i++) {
            for (int j = 0; j < COLUMNA; j++) {
                if (j == 0)
                    this.contenido[i][j] = ""+(char)(ascii++)+"";
                else if (j == COLUMNA-1)
                    this.contenido[i][j] = "0";
                
            }
        }

    }

}
