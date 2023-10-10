package Lists;
    
public class node<T> {
    T data;
    node<?> next;

    public node(T data) {
        this.data = data;
        this.next = null;
    }

    public <T2> void append(T2 data) {
        node<?> pointer = this;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new node<>(data);
    }

    private void printArray(Object data) {
        if (data instanceof Object[]) {
            Object[] array = (Object[]) data;
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                if (array[i] instanceof Object[]) {
                    printArray(array[i]); // Recursively print subarrays
                } else if (array[i] instanceof node<?>) {
                    // Handle the case where an element is a linked list (node)
                    ((node<?>) array[i]).printList();
                } else {
                    System.out.print(array[i]);
                }
            }
            System.out.print("]");
        }
    }

    private void print() {
        if (data instanceof Object[]) {
            printArray(data);
        } else if (data instanceof node<?>) {
            ((node<?>) data).printList(); // Handle the case where data is a linked list (node)
        } else {
            System.out.print(data);
        }
    }

    // Print the linked list
    public void printList() {
        System.out.print("{");
        node<?> current = this;
        while (current != null) {
            current.print();
            current = current.next;
            if (current != null) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
