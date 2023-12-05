

public interface MyCollection<E> {
    public void clear();

    public boolean isEmpty();

    public int size();

    public void add(E item);

    public boolean contains(E key);

    public boolean remove(E item);
    public E remove(int index);

}
