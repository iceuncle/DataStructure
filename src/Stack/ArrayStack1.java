package Stack;

import java.util.ArrayList;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class ArrayStack1<E> implements Stack<E> {
    private ArrayList<E> data;

    public ArrayStack1(int capacity) {
        this.data = new ArrayList<>(capacity);
    }

    public ArrayStack1() {
        this.data = new ArrayList<>();
    }


    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void push(E e) {
        data.add(e);
    }

    @Override
    public E pop() {
        return data.remove(data.size() - 1);
    }

    @Override
    public E peek() {
        return data.get(data.size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for (int i = 0; i < data.size(); i++) {
            builder.append(data.get(i));
            if (i != data.size() - 1) {
                builder.append(" ,");
            }
        }
        builder.append("] top");
        return builder.toString();
    }

    public static void main(String[] args) {

        ArrayStack1<Integer> arrayStack1 = new ArrayStack1<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayStack1.push(i);
            System.out.println(arrayStack1);
        }
        arrayStack1.push(666);
        System.out.println(arrayStack1);

        System.out.println(arrayStack1.pop());
        System.out.println(arrayStack1);

        System.out.println(arrayStack1.peek());
        System.out.println(arrayStack1);
    }
}
