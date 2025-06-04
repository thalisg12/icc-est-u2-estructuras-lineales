package Controllers;

import java.util.NoSuchElementException;
import Models.NodeGeneric;

public class QueueG<T> {

    private NodeGeneric<T> primero;
    private NodeGeneric<T> ultimo;
    private int size;

    public QueueG() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public void add(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T aux = primero.getValue();
        primero = primero.getNext();
        if (primero == null) {
            ultimo = null;
        }
        size--;
        return aux;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return primero.getValue();
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        NodeGeneric<T> aux = primero;
        while (aux != null) {
            System.out.print(aux.getValue() + " -> ");
            aux = aux.getNext();
        }
        System.out.println("null");
    }
}
