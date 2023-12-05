

import javax.swing.*;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class MyLinkedList<E> implements MyList<E> {

    private Node<E> first;
    private Node<E> last;

    private int size;

    public MyLinkedList() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void add(E item) {
        if (size == 0) {
            first = last = new Node<>(item);
        } else {
            last = last.append(item);
        }
        size++;
    }

    @Override
    public boolean remove(E item) {
        if (size == 0)
            return false;

        Map.Entry<Node<E>, Node<E>> result = first.remove(item);

        if (result == null) // nothing was removed
            return false;

        size--;

        if (size == 0) { //Entry -> <null, null>
            first = last = null;

            if (result.getKey() != null) // first node changed
                first = result.getKey();
            if (result.getValue() != null)
                last = result.getValue();
        }
        return true;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Empty List or Bad Index");

        AtomicReference<E> removed = new AtomicReference<>();
        Map.Entry<Node<E>, Node<E>> result = first.remove(index,removed);

        size--;

        if (size == 0) { //Entry -> <null, null>
            first = last = null;

            if (result.getKey() != null) // first node changed
                first = result.getKey();
            if (result.getValue() != null)
                last = result.getValue();
        }
        return removed.get();
    }


    public void listTraverse() {
        Node<E> currNode = first;
        while (currNode != null) {
            System.out.println(currNode);
            currNode = currNode.nextItem();
        }
    }


    @Override
    public boolean contains(E key) {
        if (size == 0)
            return false;
        else
            return first.canFind(key);
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Empty List or Bad Index");
        }
        return first.findByIndex(index); //can also result in a thrown exception
    }
}




