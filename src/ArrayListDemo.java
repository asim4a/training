
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("A");
        l.add(15);
        l.add(null);
        l.add("Red");
        l.add("Blue");
        l.remove(("A"));
        System.out.println(l);
        ArrayList r=new ArrayList();
        r.add("Green");
        r.add("Green tea");
        System.out.println(r);
        l.addAll(r);
        System.out.println("Addall");
        System.out.println(l);
        l.retainAll(r);
        System.out.println("retainAll");
        System.out.println(l);
        System.out.println("contains :"+l.contains("Green"));
        System.out.println("isEmpty :"+l.isEmpty());
        System.out.println("size :"+l.size());
        l.clear();
        System.out.println("clear :"+l);
    }
}