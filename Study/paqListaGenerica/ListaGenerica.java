package paqListaGenerica;

import java.util.Arrays;
import java.util.Iterator;

public class ListaGenerica<T> implements Iterable<T> {

    private T[] elementos;
    private int contador;

    public ListaGenerica() {
        this.elementos = (T[]) new Object[10];
        this.contador = 0;
    }
    public ListaGenerica(int dimension) {
        this.elementos = (T[]) new Object[dimension];
        this.contador = 0;
    }

    public void add(T elemento) {
        if ( contador >= elementos.length ) { ///si esta lleno duplico la capacidad del array
            T[] nuevoArray = (T[]) new Object[elementos.length * 2];
            System.arraycopy(elementos, 0, nuevoArray, 0, elementos.length);
            elementos = nuevoArray;
        }
        elementos[contador++] = elemento;
    }
    public T get(int indice) throws IndexOutOfBoundsException {
        if( indice >= 0 && indice < contador )
            return elementos[indice];
        else
            throw new IndexOutOfBoundsException("Indice fuera de rango.");
    }
    public void classType() {
        System.out.println("El tipo de dato T es: " +
                (elementos[0].getClass().getName()).substring(10) ); //remueve el java.lang.
    }


    @Override
    public Iterator<T> iterator() {
        return new IteradorDeLista(this);
    }

    private class IteradorDeLista implements Iterator<T> {

        private ListaGenerica<T> lista;
        private int indice;

        public IteradorDeLista(ListaGenerica<T> lista) {
            this.lista = lista;
        }

        @Override
        public boolean hasNext() {
            return (indice < lista.contador);
        }

        @Override
        public T next() {
            return lista.elementos[indice++];
        }

    }

    @Override
    public String toString() {
        return "ListaGenerica{" +
                "elementos=" + Arrays.toString(elementos).replace("null", "") +
                '}';
    }
}
