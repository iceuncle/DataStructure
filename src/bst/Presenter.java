package bst;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public interface Presenter<E> {
    int getSize();

    boolean isEmpty();

    void add(E e);

    boolean contains(E e);

    void preOrder();

    void preOrderNR();

    void inOrder();

    void postOrder();

    void levelOrder();

    E minimum();

    E maximum();

    E removeMin();

    E removeMax();

    void remove(E e);

}
