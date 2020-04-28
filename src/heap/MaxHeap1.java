package heap;

import array.Array;

/**
 * <p>
 * Created by tianyang on 2018/11/23.
 */
public class MaxHeap1<E extends Comparable<E>> implements Presenter<E> {

    private Array<E> data;

    public MaxHeap1(int capacity) {
        data = new Array<>(capacity);
    }

    public MaxHeap1() {
        data = new Array<>();
    }

    public MaxHeap1(E[] arr) {
        data = new Array<>(arr);
    }


    @Override
    public int size() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }


    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    @Override
    public void add(E e) {
        data.addLast(e);
        shiftUp(data.getSize() - 1);
    }

    private void shiftUp(int k) {
        while (k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0) {
            data.swap(k, parent(k));
            k = parent(k);
        }
    }


    @Override
    public E findMax() {
        if (data.getSize() == 0)
            throw new IllegalArgumentException("heap is empty.");
        return data.getFirst();
    }

    @Override
    public E extractMax() {
        E ret = findMax();
        data.swap(0, data.getSize() - 1);
        data.removeLast();
        shiftDown(0);
        return ret;
    }

    private void shiftDown(int k) {
        while (leftChild(k) < data.getSize()) {
            int j = leftChild(k);
            if (leftChild(k) + 1 < size() &&
                    data.get(j).compareTo(data.get(j + 1)) < 0) {
                j++;
            }
            if (data.get(k).compareTo(data.get(j)) >= 0) {
                break;
            }
            data.swap(k, j);
            k = j;
        }
    }

    @Override
    //取出最大元素，并且替换成e
    public E replace(E e) {
        E ret = findMax();
        data.set(0, e);
        shiftDown(0);
        return ret;
    }

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);
        String aStr = new String("a");
        String bStr = new String("b");
        System.out.println(aStr == bStr);
    }

}
