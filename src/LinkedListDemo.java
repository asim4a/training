import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("asim");
        l.add(45);
        l.add("Mysuru");
        System.out.println(l);
        l.addFirst("First");
        System.out.println(l);
        l.addLast("Last");
        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
    }
}