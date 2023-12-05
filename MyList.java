

/**
 * A list of objects all sitting in row.
 *
 * @param <E> The type of object held by the list
 */

public interface MyList<E> extends MyCollection<E> {
    /**
     * Returns the item at position index in the list.
     * Treats the list as linear sequence of elements, retrieves the elements at position
     * index in the sequence.
     * @param index The position of element to return.
     * @return The element of position index.
     */
    public E get(int index);
}
