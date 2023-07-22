public class MyListSet1<T> {
    int capacity = 2;
    Object data[] = new Object[capacity];
    int index = 0;

    public void add(T t) {
        if (isCapacityFull()) {
            increaseCapacity();
        }
        data[index] = t;
        index++;
        System.out.println("array : " + index);
    }

    public void add(int index, T t) {
        if (isCapacityFull()) {
            increaseCapacity();
        }
        data[index] = t;
        index++;
        System.out.println("array : " + index);
    }

    public T get(int index) {
        if (index < 0 && index < this.index) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    private boolean isCapacityFull() {
        return index == capacity;
    }

    boolean increaseCapacity() {
        capacity *= 2;
        data = new Object[capacity];
        System.out.println("increasing capaicyt new capacity : " + capacity);
        return true;
    }

    public static void main(String[] args) {
        MyListSet1<String> list = new MyListSet1<String>();
        list.add("e");
        list.add("e2");
        list.add("e3");
        list.add(0, "2");
        System.out.println(list.get(0));
    }

}