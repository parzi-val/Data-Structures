# Data-Structures

Implementations of various kinds of Data Structures.

---

## Heterogeneous lists

Java implementation of Python style lists (untyped).\
Lets you append any type of data:

- Primitive Datatypes (Int, Float, Double etc).
- Strings & Characters.
- Arrays (Use wrapper classes for primitive datatypes) (Integer[], Double[]);
- User-defined (Custom class objects and object arrays);
- Collections.
- Self elementing (element can be a heterogeneous list).

Syntax

```java
node<?> list = new node<>();
list.append(#next element (any type));

for(int i = 0; i < list.length; i++)
    list.get(i).print();

list.printList();
```

<p align="center">
    <img src=https://i.imgur.com/1kibpH3.png/>
</p>
