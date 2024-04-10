public class Node<T> {
    private Node<T> next;
    private T data;

    public Node(T value) {
        this.data = value;
    }

    // Get the data field
    public T getData() {
        return data;
    }

    // Set the data field
    public void setData(T value) {
        this.data = value;
    }

    // Get the next node
    public Node<T> getNext() {
        return next;
    }

    // Set the next node
    public void setNext(Node<T> n) {
        this.next = n;
    }
}





