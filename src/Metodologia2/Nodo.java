package Metodologia2;

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 * 
 */
public class Nodo {
    private int valor; //Varible o lista de variables para guardar datos.
    private Nodo sig; // Atributo para enlazar un nodo siguiente
    private Nodo ant; //Atributo para enlazar un nodo anterior
    
    /*El atributo valor es un modelo que puede ser reemplazado por otros
    atributos, el atributo **sig** será quien almacene la referencia a la siguiente
    la variable sin nombre y el atributo **ant** será quien almacene la referencia a 
    la variable anterior, observe que ambos atributos son del mismo tipo de 
    la clase **Nodo**
    */
    
    //Método constructor que inicializamos el valor de las variables.
    public void Nodo(){
        this.valor = 0;
        this.sig = null;
        this.ant = null;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    //Métodos get y set para los atributos
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}/*Recuerde que los métodos constructores sirven para inicializar los
atributos, así **valor** tomará cero, **sig** y **ant** tomarán **null** 
que significa nodo sin enlaces
*/