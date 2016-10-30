package ua.com.artcode;

import java.util.ArrayList;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static <T> A<T> reversion(A<T> head) {

        ArrayList<A<T>> nodes = new ArrayList<>();
        A<T> current = head;
        while (true) {
            nodes.add(current);
            if(!current.hasNext()) break;
            current = current.getNext();
        }
        A<T> next;
        A<T> first = current;
        for (int i = nodes.size() - 2; i >= 0; i--) {
                next = nodes.get(i);
                current.setNext(next);
                current = current.getNext();
            if(i == 0){
                current.setNext(null);
            }
        }
        return first;
    }
}
