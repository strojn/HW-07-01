import hw_07_01.MyList;

public class Main {
    public static void main(String[] args) {

        System.out.println("MyList int.");
        MyList<Integer> intList = new MyList<>();
        System.out.println("начальна кількість елементів:" + intList.getTotalNumber());
        intList.add(11);
        intList.add(22);
        intList.add(33);
        System.out.println("загальна кількість елементів:" + intList.getTotalNumber());
        for (int i = 0; i < intList.getTotalNumber(); i++) {
            System.out.println(intList.get(i));
        }

        System.out.println("MyList String.");
        MyList<String> stringList = new MyList<>();
        System.out.println("начальна кількість елементів:" + stringList.getTotalNumber());
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("cc");
        System.out.println("загальна кількість елементів:" + stringList.getTotalNumber());
        for (int i = 0; i < stringList.getTotalNumber(); i++) {
            System.out.println(stringList.get(i));
        }
    }
}