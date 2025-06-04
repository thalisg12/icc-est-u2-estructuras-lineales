package Models;

public class NodeGeneric<T> {

    private T value; // clases genericas
    private NodeGeneric<T> next;

    public NodeGeneric(T value, NodeGeneric<T> next) {
        this.value = value;
        this.next = next;
    }

    public NodeGeneric(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeGeneric [value=" + value + ", next=" + next + "]";
    }

}
