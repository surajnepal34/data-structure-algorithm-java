
public class LinkedList<T> {

    Node head;
    int size;

    public void insert(T elem) {

        Node<T> trav;

        if (head == null) {
            head = new Node<T>(elem, null);
        } else {
            trav = head;
            while (trav.next != null) {
                trav = trav.next;
                size++;
            }
            trav.next = new Node<T>(elem, null);
        }
        size++;
    }


    public void show() {

        Node<T> trav = head;

        StringBuilder sb = new StringBuilder("[ ");
        while (trav.next != null) {
            sb.append(trav.data + ",");
            trav = trav.next;
        }
        sb.append(trav.data);
        sb.append(" ]");

        System.out.println("The LinkedList Node Values are" + sb.toString());
    }

    public T insertAt(int index, T data) {

        int i = 0;
        Node<T> trav = head;
        System.out.println("Size: " + size);
        if (index > size || index < 0) throw new IllegalArgumentException();
        if (index == 0) {
            if (head == null) {
                head = new Node<T>(data, null);
            } else {
                head = new Node<T>(data, trav);
            }
        } else {
            while (i != index - 1) {
                trav = trav.next;
                i++;
            }

            Node<T> newNode = new Node<T>(data, trav.next);
            trav.next = newNode;
        }
        size++;
        System.out.println("The final size is :" + size);
        return data;
    }


    public boolean remove(T data) {

        if (head == null) return false;

        if (head.data == data) {
            head = head.next;
            size--;
            return true;
        }

        Node<T> trav = head;

        while (trav.next != null) {

            if (data.equals(trav.next.data)) {
                trav.next = trav.next.next;
                size--;
                return true;
            }

            trav = trav.next;
        }

        return false;
    }

}