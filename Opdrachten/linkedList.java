import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        list.add(6);
//        list.add(78);
//        list.add(1);
//
//        System.out.println(list.get(1));
//
//        Iterator it = list.iterator();
//
//
//        while (it.hasNext()) {
//            if((int) it.next() == 78) {
//                System.out.println("78 is gevonden");
//            }
//        }

        LinkedList<String> list1 = new LinkedList<String>();
        LinkedList<String> list2 = new LinkedList<String>();
        // Stack
        /* als je een op een list .push gebruikt dan wordt het een stack
         omdat als je push gebruikt wordt het laatste element toegevoegd
            en als je pop gebruikt wordt het laatste element verwijderd
         */
        list1.push("a");
        list1.push("b");
        list1.push("c");
        list1.push("d");
        list1.push("f");
        list1.pop();

        //Queue
        /* als je een list .offer gebruikt dan wordt het een Queue
         omdat als je offer gebruikt wordt het eerste element toegevoegd
            en als je poll gebruikt wordt het eerste element verwijderd
         */
        list2.offer("a");
        list2.offer("b");
        list2.offer("c");
        list2.offer("d");
        list2.offer("f");
//        list2.poll();
        list2.add(4, "e");
        list2.remove("e");


        while (list1.iterator().hasNext())

//        System.out.println(list1);
        System.out.println(list2.peekFirst());
        System.out.println(list2.peekLast());
        System.out.println(list2.indexOf("f"));
        System.out.println(list2);

    }
}
