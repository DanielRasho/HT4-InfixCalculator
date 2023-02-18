package App_main.model.Stack;

public class Nodo<E>{
    // clase nodo para las listas doblemente enlazadas/encadenadas
    E dato;
    Nodo<E> siguiente;
    Nodo<E> anterior;
    //constructor
    public Nodo(E dato){
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;

    }
    //gets y sets
    public void setDato(E dato){
        this.dato = dato;
    }

    public E getDato(){
        return dato;
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
