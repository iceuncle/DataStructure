package bst;

import java.util.ArrayList;
import java.util.Random;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class Main {
    public static void main(String[] args) {
//        BST<Integer> bst = new BST<>();
//        Random random = new Random();
//        for (int i = 0; i < 10000; i++) {
//            bst.add(random.nextInt(10000));
//        }
//
//        ArrayList<Integer> nums = new ArrayList<>();
//        while (!bst.isEmpty()) {
//            nums.add(bst.removeMax());
//        }
//        System.out.println(nums);

        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 2, 4};
        for (int num : nums)
            bst.add(num);
        bst.inOrder();

        System.out.println();

        bst.remove(3);
        bst.inOrder();

        System.out.println();

        BST1<Integer> bst1 = new BST1<>();
        for (int num : nums)
            bst1.add(num);
        bst1.inOrder();

        System.out.println();

        bst1.remove(3);
        bst1.inOrder();
    }

}
