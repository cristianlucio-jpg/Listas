package Metodologia1;

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 */
public class ListaCircular {
    private Nodo cabecera;
    //Metodo constructor
    public void ListaCircular(){
    cabecera = null;
    }
    //Método isEmpty
    public boolean esVacia(){
        return cabecera==null;
    }
    public void InsertarInicio(int valor)
    {Nodo nuevo = new Nodo();
    nuevo.setValor(valor);
    if (esVacia()) {cabecera =nuevo; //cabecera tomará la referencia del primer nodo
    nuevo.setSig(cabecera); //como es el primero se referencia a si mismo.
    }
    else{Nodo aux = cabecera;
    do{aux = aux.getSig(); //aux avanzará hasta ubicarse antes de cabecera
    }while(aux.getSig()!=cabecera);
    aux.setSig(nuevo); //Antes de cabecera se insertará en nuevo nodo
    nuevo.setSig(cabecera); //El nuevo nodo apunta al primero
    cabecera = nuevo; //Ahora el primero será el nuevo nodo
    }
 }
    
    public void InsertarFinal(int valor)
    {Nodo nuevo = new Nodo();
    nuevo.setValor(valor);
    if (esVacia()) { cabecera = nuevo;
                     nuevo.setSig(cabecera);
    }else{ Nodo aux =cabecera;
    do{aux=aux.getSig(); //avanzará hasta ubicarse antes de cabecera
    }while(aux.getSig()!=cabecera);
    aux.setSig(nuevo); //Antes de cabecera se insertará en nuevo nodo
    nuevo.setSig(cabecera); //El nuevo nodo apunta al primero   
    }
   }
    
    /*En estos algoritmos se quiere dos
    variables de referencias para agregar nuevos
    elementos al principio o al final, la variable **aux**
    servirá de ayuda para ambas inserciones
    */
    
    
    public void MostrarCompleto() 
        {if (cabecera == null) return; //si esta vacía terminará
        Nodo aux = cabecera; //aux iniciará en cabecera
        do {System.out.println(aux.getValor());
            aux = aux.getSig(); //Avanza al siguiente nodo de la lista
        } while (aux!=cabecera); //aux llegará antes de cabecera
        /*
        *Ambos métodos son iguales en el recorrido pero se diferencian
        en la condición de parada. El recorrido del método 
        **MostrarCompleto** parte de cabecera y llega hasta el nodo
        anterior de cabecera.
        El recorrido del método **MostrarIncompleto** parte de cabecera y
        llega hasta el nodo antes de cabecera.
        */
    }
    
    public void MostrarIncompleto()
    {if (cabecera==null)  return; //si esta vacia terminará
           Nodo aux = cabecera; //aux iniciara en cabecera
           do{System.out.println(aux.getValor());
               aux=aux.getSig(); //Avanza al siguiente nodo de la lista
           }while(aux.getSig()!=cabecera); //aux llegará a un nodo antes de cabecera
       }
    
    public boolean Huscar(int Abuscar){
        if (esVacia()) {
            //System.out.println("Lista vicia..");
         return false;}
        Nodo aux = cabecera;
        do{if (aux.getValor()==Abuscar) {
                //Sistem.out.println("Valor encontrado");
                return true;
            }else{
                aux=aux.getSig();
            }
        }while(aux!=cabecera);
        //System.out.println("Valor no existe en la lista);
        return false;
   }
    public void Modificar(int Abuscar, int cambio) {
        if (esVacia()) return;
        //System.out.println("Lista vacia..");
        Nodo aux = cabecera;
        do {if (aux.getValor() == Abuscar) {
                aux.setValor(cambio);
                //System.out.println("Valor modificado");
                return;}
        else{
            aux = aux.getSig();} //Avanza al siguiente nodo
        } while (aux != cabecera); //Rebota si no ha llegado al final
        System.out.println("Valor no existe en la lista");
    }
    
    public void EliminaCabecera(){
        if (esVacia()) {
            return;}
        Nodo aux = cabecera;
        do{aux = aux.getSig();
        }while(aux.getSig()!=cabecera); // Rebota si no ha llegado al último nodo
        aux.setSig(cabecera.getSig()); // El último nodo se conecta al segundo
        cabecera=cabecera.getSig(); // cabecera ahora se apuntará al segundo
        if (aux==cabecera) {//Si no hay un nodo, se lo elimina en forma automática 
        cabecera=null;
        }
    }
    
    public void EliminarTodo(){
        cabecera=null;
        System.out.println("Lista eliminada");
    }
    
    public void EliminaUltimo(){
        if (esVacia()) {
            return;}
        Nodo ant, aux=cabecera;
        do{ant = aux; //ant se ubica en la posición anterior a **aux**
           aux = aux.getSig();
        }while(aux.getSig()!=cabecera); //Rebotará hasta llegar al último
        ant.setSig(aux.getSig()); //El penúltimo apunta al primero de la lista
        if (aux==cabecera) {
        cabecera = null; //si es el único será borrado automáticamente
        }
    }
    
    public void Elimina(int Abuscar){
        boolean encontrado = false;
        if (esVacia()) {return;}
        Nodo ant = null, aux=cabecera;
        do{if (aux.getValor()==Abuscar) {
                encontrado = true;} //Si lo encuentra se activa la variable
            else{
                ant = aux;
                aux=aux.getSig();}
        }while(aux!=cabecera && !encontrado);
        if (encontrado) { //si es encontrado
            if (aux==cabecera && aux.getSig()==cabecera) {
                cabecera = null;} //verifica si el único nodo
            else{//verifica si es el primero en la lista
                if (aux==cabecera) {
                  ant.setSig(cabecera.getSig());
                  cabecera = cabecera.getSig();}
                else{
                    ant.setSig(aux.getSig());
                }
  
            }
            
        }
    }
}

 





