package map;

/**
 * <p>
 * Created by tianyang on 2018/11/23.
 */
public interface Map<K, V> {

    int getSize();

    boolean isEmpty();

    boolean contains(K key);

    V get(K key);

    void set(K key, V value);

    void add(K key, V value);

    V remove(K key);

}
