package Metodologia2;

/**
 *
 * @author Cristian Alexis Lucio Narvaez
 */
public class ListaDoble {
  private Nodo cabecera;
  
  //Método constructor
  public void ListaDoble(){
      cabecera = null;
  }
  
  //Método isEmpty
  public boolean esVacia(){
      return cabecera == null;
  }
  /*Este algoritmo utiliza la referencia **ant** 
  para retroceder hasta el primer nodo de la lista*/
  public void Retroceder(){
      if (!esVacia()) {
          while(cabecera.getAnt()!= null){
              cabecera = cabecera.getAnt();
          }
      }
  }
  /*Este algoritmo utiliza la referencia **sig** 
  para avanzar hasta el último nodo de la lista
  */
  public void Adelantar(){
      if (!esVacia()) {
          while(cabecera.getSig()!= null)
      cabecera = cabecera.getSig();
      }
  }
  
  /*Este algoritmo recorre con la referencia **sig**
  desde el primero hasta el último nodo de la lista
  */
  public void MostrarDesdePrimero()
      {if (esVacia()){ return;}
      Retroceder(); //Se ubica en el primer nodo
      Nodo aux = cabecera; //aux parte desde el principio
      while(aux!=null){
          System.out.println(aux.getValor());
          aux=aux.getSig();
      }
  }
  
  /*Este algoritmo utiliza la referencia **ant** para retroceder
  hasta el primer nodo de la lista
  */
  public void MostrarDesdeUltimo(){
      if (esVacia()){return;}
      Adelantar(); //Se ubica en el último nodo
      Nodo aux = cabecera; //aux parte desde el último
      while(aux!=null){
          System.out.println(aux.getValor());
          aux=aux.getAnt();}
  }
  
  public void insertarAlPrincipio(int valor){
      Nodo nuevo = new Nodo();
      nuevo.setValor(valor);
      if (esVacia()) {
          cabecera = nuevo;
      }
      else{
      Retroceder();
       nuevo.setSig(cabecera);
       cabecera.setAnt(nuevo);
       cabecera = nuevo;
      }
   }
  public void insertarAlFinal(int valor){
      Nodo nuevo = new Nodo();
      nuevo.setValor(valor);
      if (esVacia()) {
          cabecera = nuevo;
      }
      else{Adelantar();
      nuevo.setAnt(cabecera);
      cabecera.setSig(nuevo);
      }
  }
  public void insertarOrdenado(int valor){
      Nodo nuevo = new Nodo();
      nuevo.setValor(valor);
      if (esVacia()) {
          cabecera = nuevo;}
       else{
       Retroceder();
       while(cabecera.getSig()!=null && valor>cabecera.getValor()){
           cabecera = cabecera.getSig();
       }
       if(cabecera.getAnt()==null && valor<cabecera.getValor()) {
          nuevo.setSig(cabecera);
          cabecera.setAnt(nuevo);
       }
       else{
           if (cabecera.getSig()==null && valor>cabecera.getValor()) {
            nuevo.setAnt(cabecera);
            cabecera.setSig(nuevo);
           }
           else{
               nuevo.setSig(cabecera);
               nuevo.setAnt(cabecera.getAnt());
               cabecera.getAnt().setSig(nuevo);
               cabecera.setAnt(nuevo);
           }
          }
         }
    }
  public boolean buscar(int valor){
  if(esVacia()){
     //System.out.println("No hay datos");
   return false;}
  Retroceder(); //Se ubica en el primer nodo 
  Nodo aux = cabecera;
  while(aux!=null){
      if (aux.getValor()==valor) {
        //System.out.println("Dato encontrado");
        return true;}
      else{
          aux = aux.getSig();}
      }
      //System.out.pritln("Dato no existe en la lista");
      return false;
      }
  
  public void modificar(int Abuscar, int cambio){
      if (esVacia()) {
          return;}
      Retroceder(); //Se ubica en el primer nodo
      Nodo aux = cabecera;
      while(aux!=null){
          if (aux.getValor()==Abuscar) {
           aux.setValor(cambio);
           return;
          }else{
              aux = aux.getSig();
          }
      }
  }
  
  public void EliminaValor(Integer valor){
      if (cabecera!=null) {
          Nodo aux = cabecera;
          Nodo ant = null;
          while(aux!=null){
              if (aux.getValor()==valor) {
                  if (ant == null) { //verifica si es primero
                      cabecera = cabecera.getSig();
                      aux.setSig(null);
                      aux=cabecera;
                  }else{
                      ant.setSig(aux.getSig());
                      if (aux.getSig()!=null) {
                          aux.getSig().setAnt(ant);}
                          aux.setSig(null);
                          aux.setAnt(null);
                      }
              }else{
                   ant = aux;
                   aux = aux.getSig();
                  }
              }
          }
      }
  }

 


