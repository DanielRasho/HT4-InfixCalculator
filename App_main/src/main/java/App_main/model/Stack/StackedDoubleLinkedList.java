package App_main.model.Stack;
import java.util.ArrayList;
import java.util.List;

public class StackedDoubleLinkedList<E> extends ListStack<E> implements Stack<E> {
    //Nodo<E> node =new Nodo<>();
    /**
     * Clase nodo, que crea los nodos anterior/data(elemento)/siguiente
     */
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
    // lo que se llama head y tail
    Nodo<E> primero;
    Nodo<E> ultimo;
    /**
    * asignación de datos a variables e instancia de anterior y siguiente
     */
    public StackedDoubleLinkedList(){
        //@rayo perdon esto no esta en ingles
        this.data = new ArrayList<>();
        //nodo.setDato(this.data);
        size=0;
        primero=null;
        ultimo=null;
        Nodo<E> anterior;
        Nodo<E> siguiente;

    }
    /**
     * @return int
     * Lo que retorna es el tamaño de la lista doblemente encadenada
     */
    public int Size(){
        return size;
    }
    //agregar xd
    /**
     * Añade a la lista el elemento e incrementa el tamaño de la lista
     * */
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
    /**
     * Elimina de la lista el elemento y disminuye el tamaño de la lista
     * */
    public E pop(int index){
        if (index<0){
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
    /**
     * Elimina todos los elementos de la lista, además que asigna como
     * null a primero y ultimo de la lista, mientras que el tamaño se vuelve 0,
     * porque ya no hay ningun elemento
     * */
    public void Clear(){
        this.data= null;
        primero= null;
        ultimo  = null;
        size= 0;
    }

    /**
     * Obtiene los datos
     * */
    public List<E> getData(){
        return data;
    }
    /**
     * Asigna los datos
     * */
    public void setData(){
        this.data= data;
    }



}
