import hw_07_01.NewList;

public class Main {
    public static void main(String[] args) {

        System.out.println("newList double.");
        NewList<Double> newList = new NewList<>();
        System.out.println("начальна кількість елементів:" + newList.getTotalNumber());
        System.out.println("розмір масива: " + newList.array.length);
        newList.add(1.1);
        System.out.println("розмір масива: " + newList.array.length);
        newList.add(2.2);
        System.out.println("розмір масива: " + newList.array.length);
        newList.add(3.3);
        System.out.println("розмір масива: " + newList.array.length);
        newList.add(4.4);
        System.out.println("розмір масива: " + newList.array.length);
        newList.add(5.5);
        System.out.println("розмір масива: " + newList.array.length);
        System.out.println("загальна кількість елементів:" + newList.getTotalNumber());
        for (int i = 0; i < newList.getTotalNumber(); i++) {
            System.out.println(newList.get(i));
        }

    }
}