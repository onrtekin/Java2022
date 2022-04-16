package day46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //Hem List, hem de Queue nn child class idir.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        // add methodu List den geldigi icin hep sona ekler
        list.addFirst(11);//addFirst deque den gelir ---basa ekler
        list.addLast(12);//addLast deque gelir------sona ekler
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
    }
}
