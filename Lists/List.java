package Lists;

public class List<T> {
    T data;
    List<?> next;
    boolean headNode;
    public int length;

    public List() {
        this.data = null;
        this.next = null;
        this.headNode = true;
    }

    public List(T data) {
        this.data = data;
        this.next = null;
        this.headNode = false;
    }

    @SuppressWarnings("unchecked")
    public <T2> void append(T2 data) {
        if (this.headNode && this.data == null) {
            this.data = (T) data;
            this.length = 1;
            return;
        }

        List<?> pointer = this;
        while (pointer.next != null) {
            pointer = pointer.next;
        }
        pointer.next = new List<>(data);
        this.length++;
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
                } else if (array[i] instanceof List<?>) {
                    // Handle the case where an element is a linked list (node)
                    ((List<?>) array[i]).printList();
                } else if (array[i] instanceof String) {
                    System.out.print("\"" + array[i] + "\"");
                } else {
                    System.out.print(array[i]);
                }
            }
            System.out.print("]");
        }
    }

    public void print(boolean ln) {
        if (data instanceof Object[]) {
            printArray(data);
        } else if (data instanceof List<?>) {
            ((List<?>) data).printList(); // Handle the case where data is a linked list (node)
        } else if (data instanceof String) {
            System.out.print("\"" + data + "\"");
        } else {
            System.out.print(data);
        }
        if (ln)
            System.out.println();
    }

    public void printList() {
        System.out.print("{");
        List<?> current = this;
        while (current != null) {
            current.print(false);
            current = current.next;
            if (current != null) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public List<?> get(int index) {
        List<?> pointer = this;
        int currentIndex = 0;

        while (pointer != null && currentIndex < index) {
            pointer = pointer.next;
            currentIndex++;
        }
        return (pointer != null) ? (List<?>) pointer : null;
    }
}
