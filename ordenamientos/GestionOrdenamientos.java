package ordenamientos;

/**
 * Clase que implementa ordenamientos  BubbleSort y InsertionSort
 * author: Vinni 
 * email: vinni9@gmail.com
 * 
 */
public class GestionOrdenamientos {
    private Persona personas[];
    private Persona personasOrdenado[];

    public GestionOrdenamientos(int tamano){
        this.personas = new Persona[tamano];
    }
    public void adicionarPersona(Persona persona){
        int disponible = this.buscaDisponible();
        this.personas[disponible] = persona;
    }
    private int buscaDisponible() {
        int i = 0;
        for(; i<this.personas.length;i++){
            if (this.personas[i] == null){
                break;
            }

        }
        return i;
    }
    public void ordenaBubbleSort()
    {
        this.personasOrdenado = this.personas;
        int longitud = personasOrdenado.length;
        for (int i = 0; i < longitud - 1; i++)
            for (int j = 0; j < longitud - i - 1; j++)
                if (personasOrdenado[j].getIdentificacion() > personasOrdenado[j + 1].getIdentificacion()) {
                    // swap arr[j+1] and arr[j]
                    Persona temp = personasOrdenado[j];
                    personasOrdenado[j] = personasOrdenado[j + 1];
                    personasOrdenado[j + 1] = temp;
                }
    }
    public void imprimirOriginal (){
        System.out.println(" - - - - -- - LISTA DE PERSONAS ---- ");
        for (int i = 0; i < this.personas.length; i++){
            System.out.println(this.personas[i]);

        }
    }
    public void imprimirOrdenado (){
        System.out.println(" - - - - -- - LISTA DE PERSONAS ---- ");
        for (int i = 0; i < this.personasOrdenado.length; i++){
            System.out.println(this.personasOrdenado[i]);

        }
    }


    /*
     * procedure insertionSort(A: list of sortable items)
        n = length(A)
        for i = 1 to n - 1 do
            j = i
            while j > 0 and A[j-1] > A[j] do
                swap(A[j], A[j-1])
                j = j - 1
            end while
        end for
        end procedure
     */
    void ordenaInsertionSort()
    {
        this.personasOrdenado = this.personas;
        int n = this.personasOrdenado.length;
        for (int i = 1; i < n; ++i) {
            Persona key = this.personas[i];
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && this.personasOrdenado[j].getIdentificacion() > key.getIdentificacion()) {
                this.personasOrdenado[j + 1] = this.personasOrdenado[j];
                j = j - 1;
            }
            this.personasOrdenado[j + 1] = key;
        }
    }
    public void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
 
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
 
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public int partition(int[] arr, int low, int high)
    {
        // Choosing the pivot
        int pivot = arr[high];
 
        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
 
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
