package Controllers;

import java.util.EmptyStackException;

import Models.Node;

public class Queue {

    private Node primero; // head - front
    private Node ultimo; // back - tail
    private int size;

    public Queue(Node primero, Node ultimo, int size) {
        this.primero = null;
        this.ultimo = null;
        this.size = size;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            primero = newNode;
            ultimo = newNode;
        } else {
            ultimo.setNext(newNode);
            ultimo = newNode;

        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int aux = primero.getValue();
        primero = primero.getNext();
        return aux;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException(); // if(isEmpty())throw new EmptyStackException();return primero.getValue();
        }
        return primero.getValue();

    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return size;
    }

}
