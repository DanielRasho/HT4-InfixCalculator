package App_main.model.Stack;
import java.util.ArrayList;
public class StackedDoubleLinkedList<E> extends ListStack<E> implements Stack<E> {
    //Nodo<E> nodo =new Node<>();
    private static class Nodo<E>{
        E data;
        Nodo<E>  anterior;
        Nodo<E> siguiente;

        public Nodo(E data){
            this.data = data; //(E) new ArrayList<>();
            this.anterior=null;
            this.siguiente=null;
        }

    }


    int size;
    /*Nodo<E>  anterior;
    Nodo<E> siguientes;*/
    // lo que se llama head y tail
    Nodo<E> primero;
    Nodo<E> ultimo;

    public StackedDoubleLinkedList(){
        // TODO
        //@rayo perdon esto no esta en ingles
        this.data = new ArrayList<>();
        //nodo.setDato(this.data);
        size=0;
        primero=null;
        ultimo=null;
        Nodo<E> anterior;
        Nodo<E> siguiente;

    }
    public int Size(){
        return size;
    }
    //agregar xd
    public void add(E data){
        Nodo<E> nuevoNodo = new Nodo<>(data);
        if (size==0){
            primero=nuevoNodo;
            ultimo=nuevoNodo;
        }else{
            ultimo.siguiente=nuevoNodo;
            nuevoNodo.anterior= ultimo;
            ultimo=nuevoNodo;
        }
        size++;
    }


    //eliminar
    public E pop(int index){
        if (index<0 ||index>=size){
            throw new IndexOutOfBoundsException();
        }

        Nodo<E> actual= primero;
        for (int i=0; i<index; i++){
            actual=actual.siguiente;
        }

        E data =actual.data;

        if (actual.anterior==null){
            primero=actual.siguiente;
        }else{
            actual.anterior.siguiente=actual.siguiente;
        }

        if (actual.siguiente == null){
            ultimo=actual.anterior;

        }else{
            actual.siguiente.anterior=actual.anterior;
        }
        size--;

        return data;
    }


}
