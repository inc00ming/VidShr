public class Node<T> {
    private Node<T> next;
    private T data;

    Node(){
        System.out.println("Node object is created");
    }

    Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    @Override
    public String toString() {
        return "Data:"+data;
    }
}
