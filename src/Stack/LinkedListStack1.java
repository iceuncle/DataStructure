package Stack;

import LinkedList.LinkedList;

/**
 * <p>
 * Created by tianyang on 2018/11/22.
 */
public class LinkedListStack1<E> implements Stack<E> {
    private LinkedList<E> array;

    public LinkedListStack1() {
        this.array = new LinkedList<E>();
    }


    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addFirst(e);
    }

    @Override
    public E pop() {
        return array.removeFirst();
    }

    @Override
    public E peek() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        return "LinkedListStack1: top " + array;
    }

    public static void main(String[] args) {
        LinkedListStack1<Integer> stack = new LinkedListStack1<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }

}
