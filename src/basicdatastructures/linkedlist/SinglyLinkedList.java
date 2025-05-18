package basicdatastructures.linkedlist;

public class SinglyLinkedList<E> {
    // Nested Node class
    private static class Node<E> {
        private E element;      // Reference to the element stored at this node
        private Node<E> next;   // Reference to the subsequent node in the list

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
    } // End of nested Node class

    // Instance variables of the SinglyLinkedList
    private Node<E> head = null;    // head node of the list (or null if empty)
    private Node<E> tail = null;    // last node of the list (or null if empty)
    private int size = 0;

    public SinglyLinkedList() {
        // constructs an initially empty list
    }

    // access methods
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // Returns (but does not remove) the first element
    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    // Returns (but does not remove) the last element
    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    // Update methods
    // Adds element to the front of the list
    public void addFirst(E element) {
        head = new Node<>(element, head);   // Create and link a new node
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    // Adds element to the end of the list
    public void addLast(E element) {
        Node<E> newest = new Node<>(element, null);     // Node will eventually be the tail
        if (isEmpty()) {
            tail = newest;                  // Special case: previously empty list
        } else {
            tail.setNext(newest);           // new node after existing tail
        }
        tail = newest;                      // new node becomes the tail
        size++;
    }

    // Removes and returns the first element
    public E removeFirst() {
        if (isEmpty()) {    // nothing to remove
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();  // will become null if list had only one node
        size--;
        if (size == 0) {
            tail = null;    // special case as list is now empty
        }
        return answer;
    }
}
