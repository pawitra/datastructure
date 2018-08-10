package pawitra.datastructure;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollection implements Collection {
    private Object[] elementData;
    private int size;

    public ArrayCollection(int c) {
        elementData = new Object[c];
        size = 0;
    }

    public void add(Object element) {
        if(element == null) throw new IllegalArgumentException();
        elementData[size++] = element;
    }

    private int indexOf(Object e) {
        for (int i=0; i<size; i++)
            if (elementData[i].equals(e)) return i;
        return -1;
    }

    public void remove(Object element) {
        int i = indexOf(element);
        if (i != -1) {
            elementData[i] = elementData[--size];
            elementData[size] = null;
        }
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean contains(Object element) {
        return false;
    }

    public int size() {
        return size;
    }


}
