package basicdatastructures.linkedlist;

public class SinglyLinkedList<E> {
    private class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {}

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E getFirst() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(E element) {
        Node<E> newTail = new Node<>(element, null);
        if (isEmpty()) {
            head = newTail;
        } else {
            tail.setNext(newTail);
        }
        tail = newTail;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0){
            tail = null;
        }
        return answer;
    }
}
