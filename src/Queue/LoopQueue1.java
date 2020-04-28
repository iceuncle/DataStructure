package Queue;

/**
 * <p>
 * Created by tianyang on 2018/11/21.
 */
public class LoopQueue1<E> implements Queue<E> {
    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue1(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue1() {
        this(10);
    }


    @Override
    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(data.length * 2);
        }
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("dequeue failed, queue is empty.");
        }
        E ret = data[front];
        front = (front + 1) % data.length;
        size--;
        if (size == getCapacity() % 4 && getCapacity() / 2 != 0) {
            resize(getCapacity() / 2);
        }
        return ret;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;
        tail = size;
    }


    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("dequeue failed, queue is empty.");
        }
        return data[front];
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("LoopQueue1 size is %d, capacity is %d\n", size, data.length));
        builder.append("top [");
        for (int i = 0; i < size; i++) {
            builder.append(data[(i + front) % data.length]);
            if (i != size - 1) {
                builder.append(" ,");
            }
        }
        builder.append("] tail");
        return builder.toString();
    }


    public static void main(String[] args) {
        LoopQueue1<Integer> loopQueue1 = new LoopQueue1();
        for (int i = 0; i < 20; i++) {
            loopQueue1.enqueue(i);
            System.out.println(loopQueue1);
        }
        for (int i = 0; i < 20; i++) {
            loopQueue1.dequeue();
            System.out.println(loopQueue1);
        }
    }
}
