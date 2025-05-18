package basicdatastructures.linkedlist;

public class CircularlyLinkedList<E> {
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

    private Node<E> tail = null;
    private int size = 0;

    public CircularlyLinkedList() {}

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
        return tail.getNext().getElement();
    }

    public E getLast() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (!isEmpty()) {
            tail = tail.getNext();
        }
    }

    public void addFirst(E element) {
        if (isEmpty()) {
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> firstNode = new Node<>(element, tail.getNext());
            tail.setNext(firstNode);
        }
        size++;
    }

    public void addLast(E element) {
        addFirst(element);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
}
