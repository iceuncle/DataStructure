package Stack;

/**
 * <p>栈 FILO
 * Created by tianyang on 2018/11/21.
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();

}
