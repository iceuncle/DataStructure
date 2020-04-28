package LinkedList;

/**
 * <p>
 * Created by tianyang on 2018/11/21.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2, 666);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.removeFirst();
        System.out.println(linkedList);

        linkedList.removeLast();
        System.out.println(linkedList);

        System.out.println(".........");

        LinkedList1<Integer> linkedList1 = new LinkedList1<Integer>();
        for (int i = 0; i < 5; i++) {
            linkedList1.addFirst(i);
            System.out.println(linkedList1);
        }
        linkedList1.add(2, 666);
        System.out.println(linkedList1);

        linkedList1.remove(2);
        System.out.println(linkedList1);

        linkedList1.removeFirst();
        System.out.println(linkedList1);

        linkedList1.removeLast();
        System.out.println(linkedList1);

    }
}
