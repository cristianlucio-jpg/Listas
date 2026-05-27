# Proyecto ListasEnlazadas

Este proyecto implementa diferentes tipos de **listas enlazadas en Java**:  
- Lista circular  
- Lista doblemente enlazada  

Las listas son estructuras dinámicas que permiten almacenar y manipular colecciones de datos de forma eficiente.  
Cada nodo contiene información y referencias a otros nodos, lo que permite operaciones como inserción, eliminación y búsqueda.

---

## 📂 Estructura del proyecto
ListasEnlazadas/
├── src/
│   ├── Metodologia1/
│   │   ├── ListaCircular.java
│   │   └── Nodo.java
│   ├── Metodologia2/
│   │   ├── ListaDoble.java
│   │   ├── Main.java
│   │   └── Nodo.java
├── docs/
│   └── listas1.pdf   # Documentación teórica
├── README.md
├── .gitignore
└── LICENSE

Código

---

## 📌 Clases principales

### 1. Clase `Nodo`
Representa cada elemento de la lista.  
- **Atributos:**  
  - `int valor`: almacena el dato.  
  - `Nodo sig`: referencia al siguiente nodo.  
  - `Nodo ant`: referencia al nodo anterior (solo en listas dobles).  

---

### 2. Clase `ListaCircular`
Implementa la lógica de una lista circular.  
- **Métodos principales:**  
  - `esVacia()` → verifica si la lista está vacía.  
  - `insertarInicio(int valor)` / `insertarFinal(int valor)` → inserta un nodo.  
  - `mostrarCompleta()` / `mostrarIncompleta()` → recorre e imprime los elementos.  
  - `buscar(int valor)` → retorna `true` si el valor existe.  
  - `modificar(int valor, int nuevo)` → cambia el valor de un nodo.  
  - `eliminar()` → elimina nodos (cabecera, último o todos).  

---

### 3. Clase `ListaDoble`
Implementa la lógica de una lista doblemente enlazada.  
- **Métodos principales:**  
  - `insertarAlPrincipio(int valor)` / `insertarAlFinal(int valor)`  
  - `insertarOrdenado(int valor)`  
  - `mostrarDesdePrimero()` / `mostrarDesdeUltimo()`  
  - `retroceder()` / `adelantar()`  

---

### 4. Clase `Main`
Clase de prueba para demostrar el funcionamiento de las listas.  
- Inserta valores en las listas.  
- Muestra resultados en consola.  

---

## 🖥️ Ejemplo de uso
```java
public static void main(String[] args) {
    ListaCircular lista = new ListaCircular();
    lista.insertarFinal(23);
    lista.insertarFinal(8);
    lista.insertarFinal(11);

    lista.mostrarCompleta();
}
Salida esperada:

Código
  23
  8
  11
