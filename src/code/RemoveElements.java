package code;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class RemoveElements {


    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode node = new ListNode(nums);
        System.out.println(node);

        ListNode ret = (new RemoveElements()).removeElements(node, 6);
        System.out.println(ret);
    }


}
