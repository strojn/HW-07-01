package hw_07_01;

import java.util.ArrayList;

public class MyList<TYPE> {
    private int totalNumber = 0;
    public int getTotalNumber() {
        return totalNumber;
    }
    ArrayList<TYPE> dataList = new ArrayList<>();
    public void add(TYPE newElement) {
        dataList.add(newElement);
        totalNumber++;
    }
    public TYPE get(int elementIndex) {
        return dataList.get(elementIndex);
    }
}
