package array;

import java.util.ArrayList;

/**
 * <p>
 * Created by tianyang on 2018/11/21.
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> array = new Array<Integer>();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);


        System.out.println(".........");

        Array1<Integer> array2 = new Array1<Integer>();
        for (int i = 0; i < 10; i++) {
            array2.addLast(i);
        }
        System.out.println(array2);

        array2.add(1, 100);
        System.out.println(array2);

        array2.addFirst(-1);
        System.out.println(array2);

        array2.remove(2);
        System.out.println(array2);

        array2.removeElement(4);
        System.out.println(array2);

        array2.removeFirst();
        System.out.println(array2);

        System.out.println(".........");


        ArrayList<Integer> array1 = new ArrayList<>(20);
        for (int i = 0; i < 10; i++) {
            array1.add(i);
        }
        System.out.println(array1);

        array1.add(1, 100);
        System.out.println(array1);

        array1.add(0, -1);
        System.out.println(array1);

        array1.remove(2);
        System.out.println(array1);

        array1.remove(Integer.valueOf(4));
        System.out.println(array1);

        array1.remove(0);
        System.out.println(array1);


    }

}
