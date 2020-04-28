package array;

/**
 * <p>
 * Created by tianyang on 2018/11/21.
 */
public interface Presenter<E> {
    //获取大小
    int getSize();

    //获取容量
    int getCapacity();

    //返回是否为空
    boolean isEmpty();

    //向所有元素后添加元素
    void addLast(E e);

    //在所有元素前添加元素
    void addFirst(E e);

    //添加元素
    void add(int index, E e);

    //获取索引为index的元素
    E get(int index);

    //修改索引为index的元素
    void set(int index, E e);

    //查找数组中是否有元素e
    boolean contains(E e);

    //查找数组中元素e的索引
    int find(E e);

    //删除索引为index的元素，返回被删除元素
    E remove(int index);

    //删除第一个元素，返回被删除元素
    E removeFirst();

    //删除最后一个元素，返回被删除元素
    E removeLast();

    //从数组中删除元素
    void removeElement(E e);

    //扩容
    void resize(int newCapacity);

}
