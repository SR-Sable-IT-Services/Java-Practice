public class MyClassRemove<P> {

    int capacity = 3;
    int index = 0;
    Object[] data1 = new Object[capacity];

    public void add(P p) {
        if (isCapacityFull()) {
            throw new IndexOutOfBoundsException();
        } else {
            data1[index] = p;
            index++;
        }
    }

    public P get(int index) {
        if (index < 0 && index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        return (P) data1[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        Object[] data2 = new Object[capacity - 1];
        int j = 0;
        for (int i = 0; i < capacity; i++) {
            if (i != index) {
                data2[j] = data1[i];
                j++;
            }
        }
        data1 = data2;
    }

    boolean isCapacityFull() {
        return index == capacity;

    }

    public static void main(String[] args) {
        MyClassRemove<String> st = new MyClassRemove<>();
        st.add("hi");
        st.add("hii");
        st.add("hiii");
        System.out.println(st.get(2)); //will get the elements from index 2
        st.remove(2);                  //will remove the elements from index 2
        System.out.println(st.get(2)); //Will throw IndexOutOfBoundsException.
    }

}
