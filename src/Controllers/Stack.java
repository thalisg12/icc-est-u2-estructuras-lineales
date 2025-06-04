package Controllers;

import java.util.EmptyStackException;

import Models.Node;

public class Stack {

    private Node top; // Nodo sima de la pida

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Node aux = top;
        while (aux != null) {
            System.out.print(aux.getValue() + "|");
            aux = aux.getNext();
        }
        System.out.println("");
    }

    public int size() {
        Node aux = top;
        int cont = 0;
        while (aux != null) {
            aux = aux.getNext();
            cont += 1;
        }
        return cont;
    }
    // tamaño; 4
    // tamaño: 3
}
