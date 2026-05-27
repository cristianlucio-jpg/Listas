package Metodologia2;

/**
 *
 * @author Cristian Alexis Lucio Narvaéz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
      ListaDoble lista = new ListaDoble();
        System.out.println("<<- Ejemplo de lista doble ->>\n");
        lista.insertarAlPrincipio(10);
        lista.insertarAlFinal(12);
        lista.insertarOrdenado(22);
        lista.insertarOrdenado(31);
        lista.MostrarDesdePrimero();
        System.out.println("\nActualiza el valor 22 del tercer nodo por 16");
        lista.modificar(12,16);
        lista.MostrarDesdePrimero();
        System.out.println("\nElimina el 12 de la lista");
        lista.EliminaValor(12);
        lista.MostrarDesdeUltimo();
        System.out.println("\n\n<<-Fin de ejemplo lista doble->>");
        
    }
    
}
