package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        System.out.println();
        for (String obj : list) {
            System.out.print(obj + ", ");
        }

        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + ", ");
        }
    }
}
