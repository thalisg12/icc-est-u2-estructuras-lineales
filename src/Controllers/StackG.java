package Controllers;

import java.util.EmptyStackException;
import Models.NodeGeneric;

public class StackG<T> {

    private NodeGeneric<T> tope;
    private int size;

    public StackG() {
        this.tope = null;
        this.size = 0;
    }

    public void push(T value) {
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        newNode.setNext(tope);
        tope = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = tope.getValue();
        tope = tope.getNext();
        size--;
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return tope.getValue();
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void printStack() {
        NodeGeneric<T> aux = tope;
        while (aux != null) {
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNext();
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
