package Queue;

/**
 * <p>
 * Created by tianyang on 2018/11/21.
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
