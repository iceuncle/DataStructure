package heap;

/**
 * <p>
 * Created by tianyang on 2018/11/23.
 */
public interface Presenter<E> {
    int size();

    boolean isEmpty();

    void add(E e);

    E findMax();

    E extractMax();

    E replace(E e);

}
