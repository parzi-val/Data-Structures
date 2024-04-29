import Lists.node;

class Main {
    public static void main(String[] args) {
        node<?> list = new node<>();

        list.append("world"); // String values
        list.append(42); // Any kinds of numeric values
        list.append(new Integer[] { 1, 2, 3, 4 }); // Arrays (of any type)

        node<?> sublist = new node<>();
        sublist.append("linked");
        sublist.append("list");
        sublist.append(new String[] { "hello", "world" });

        list.append(sublist); // even other linked lists
        list.printList();
    }
}
