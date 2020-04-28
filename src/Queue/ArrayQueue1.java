package Queue;

import array.Array;

import java.util.ArrayList;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class ArrayQueue1<E> implements Queue<E> {
    private ArrayList<E> array;

    public ArrayQueue1() {
        this.array = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.add(e);
    }

    @Override
    public E dequeue() {
        return array.remove(0);
    }

    @Override
    public E getFront() {
        return array.get(0);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Queue1: ");
        builder.append("front [");
        for (int i = 0; i < getSize(); i++) {
            builder.append(array.get(i));
            if (i != getSize() - 1) {
                builder.append(", ");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }

    public static void main(String[] args) {
        ArrayQueue1<Integer> queue = new ArrayQueue1<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
