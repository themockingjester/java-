package main;

public class MainClass {
    public static void main(String[] args) {
        Definition<Integer> list = new Definition<>();
        list.addFirst(2);
        list.addLast(78);

        list.addFirst(4);
        list.addLast(6);
        list.addFirst(5);

        list.addLast(78);
        list.addLast(455);
        list.insertAt(3,98);
        list.addAfter(6,50);
        list.addLast(48);
        //list.removeFirst();
        list.removeUsingValue(50);
        //list.removeLast();
        list.show();
        list.size();
        System.out.println("now sorted form");
        list.sort();
        list.removeUsingValue(455);
        list.show();

        //list.search(5);
    }
}
