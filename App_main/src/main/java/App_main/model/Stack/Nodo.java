package App_main.model.Stack;

/**
 * Crea la clase nodos
 * @param <E> Expresion
 */
public class Nodo<E>{
    public E data;
    // clase nodo para las listas doblemente enlazadas/encadenadas
    //E data;
    Nodo<E> siguiente;
    Nodo<E> anterior;
    //constructor
    /*public Nodo(){
        this.data= data;
        //this.data = new ArrayList<>();
        //this.data = data;
        this.siguiente = null;
        this.anterior = null;

    }*/

    /**
     * Constructor que da estructura a los nodos.
     * @param data
     * @param <E>
     */

    public <E> Nodo(E data) {
        //this.data= data;
        //this.data = new ArrayList<>();
        //this.data = data;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Declaramos los Get y sets para obtener y asignar valores.
     * @param data
     */
    //gets y sets
    public void setData(E data){
        this.data = data;
    }

    public E getData(){
        return data;
    }

    public Nodo<E> setAnterior(Nodo<E> anterior){
        this.anterior= anterior;
        return anterior;
    }

    public Nodo<E> getAnterior(){
        return anterior;
    }

    public Nodo<E> setSiguiente(Nodo<E> siguiente){
        this.siguiente= siguiente;

        return siguiente;
    }

    public Nodo<E> getSiguiente(){
        return siguiente;
    }
}
