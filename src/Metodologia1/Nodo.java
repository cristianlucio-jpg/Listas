package Metodologia1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 * 
 */
public class Nodo {
    private int valor; //Varible o lista de variables para guardar datos.
    private Nodo sig; // Atributo para hacer referencia al nodo siguiente.
    private Nodo ant; //Atributo para enlazar un nodo anterior
    
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
    
}
