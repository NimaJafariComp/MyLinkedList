

import java.util.AbstractMap;
import java.util.Map;
import java.util.Map.Entry; // decent poor man pair, we are going to build an entry
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Node<E> {
    private Node<E> left;
    private Node<E> right;
    private E item;

    public Node(E item_arg) {
        item = item_arg;
        left = null;
        right = null;

    }

    public Node<E> nextItem() {
        return right;
    }


    public Node<E> append(E item) {
        Node<E> result = new Node<>(item);
        right = result;
        result.left = this;
        return result;
    }


    /* public boolean canFind(E key) {
         /// need real body/search function
         Node<E> Tmp = this;
         while (Tmp != null) {
             if (Tmp.item == null) {
                 if (key == null)
                     return true;
                 else
                     return false;
           } else if (key == null)
                 return false;
               else if (Tmp.item.equals(key))
                 return true;

             Tmp = Tmp.right;
         }
         return false;
     }

     */
    public boolean canFind(E key) {
        /// need real body/search function
        Node<E> Tmp = this;
        while (Tmp != null) {
            if (Tmp.item == null && key != null)
                return false;
            else if (Tmp.item != null && key == null)
                return false;
            else if (Tmp.item == null && key == null)
                return true;
            else if (Tmp.item.equals(key))
                return true;

            Tmp = Tmp.right;
        }
        return false;
    }

    private Node<E> getNodeByIndex(int index) throws IndexOutOfBoundsException {
        Node<E> Tmp = this;
        while (Tmp != null && index != 0) {
            if (index < 0) {
                Tmp = Tmp.left; //forces me to check for null
                index++;
            } else {
                Tmp = Tmp.right;
                index--;
            }
        }
        if (Tmp == null) { //ran off the end of the list in one direction
            throw new IndexOutOfBoundsException();
        }
        return Tmp;
    }

    public E findByIndex(int index) throws IndexOutOfBoundsException {
        return getNodeByIndex(index).item;
    }

    public Map.Entry<Node<E>, Node<E>> remove(E thing) {
        //null if was not found
        // <nfirst, nlast> if it was found and removed
        // nfirst or nlast if
        Node<E> temp = this;

        while (temp != null && !temp.item.equals(thing)) {
            temp = temp.right; //we search for the thing
        }
        if (temp == null) //not found
            return null;

        return temp.clipOut();
    }

    public Map.Entry<Node<E>, Node<E>> remove(int index, AtomicReference<E> ref) {
        Node<E> remove = getNodeByIndex(index);
        ref.set(remove.item);
        return remove.clipOut();
    }

    Map.Entry<Node<E>, Node<E>> clipOut() {
        Node<E> nfirst = null;
        Node<E> nlast = null;

        if (left == null)
            // if it's the first item the list
            nfirst = right;
        else
            left.right = right;


        if (right == null)
            // last item in the list
            nlast = left;
        else
            right.left = left;

        return new AbstractMap.SimpleEntry<>(nfirst, nlast);
    }
    @Override
    public String toString() {
        return item.toString();
    }
}
