package code;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class Sum {
    public static int sum(int[] arrs) {
        return sum(arrs, 0);
    }

    //l..n区间的和
    public static int sum(int[] arrs, int l) {
        if (l == arrs.length) {
            return 0;
        }
        return sum(arrs, l + 1) + arrs[l];
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}));
    }
}
