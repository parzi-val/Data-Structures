import Lists.List;

class Main {
    public static void main(String[] args) {
        List<?> list = new List<>();

        list.append("world"); // String values
        list.append(42); // Any kinds of numeric values
        list.append(new Integer[] { 1, 2, 3, 4 }); // Arrays (of any type)

        List<?> sublist = new List<>();
        sublist.append("linked");
        sublist.append("list");
        sublist.append(new String[] { "hello", "world" });

        list.append(sublist); // even other linked lists

        for (int i = 0; i < list.length; i++) {
            list.get(i).print(true);
        }
    }
}
