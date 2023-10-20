package hw_07_01;

public class NewList<TYPE> {
    private int totalNumber = 0;
    public int getTotalNumber() {
        return totalNumber;
    }
    public Object[] array = new Object[2];
    public void add(TYPE newElement) {
        int N = array.length;
        if (N == totalNumber) {
            Object[] newArray = new Object[N + N/2];
            System.arraycopy(array, 0, newArray, 0, N);
            array = newArray;
        }
        array[totalNumber] = newElement;
        totalNumber++;
    }
    public TYPE get(int elementIndex) {
        return (TYPE) array[elementIndex];
    }
}
