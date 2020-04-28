package set;

/**
 * <p>
 * Created by tianyang on 2018/11/23.
 */
public interface Set<E> {
    void add(E e);

    void remove(E e);

    boolean contains(E e);

    int getSize();

    boolean isEmpty();
}
