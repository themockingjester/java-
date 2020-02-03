package main;
import Class.LinkedListClass;
public class Main {
    public static void main(String[] args) {
        
        LinkedListClass<Integer> obj = new LinkedListClass<Integer>();
        LinkedListClass<Integer> obj2 = new LinkedListClass<Integer>();
        LinkedListClass<Integer> obj3 = new LinkedListClass<Integer>();
        LinkedListClass<Integer> obj4 = new LinkedListClass<Integer>();
        LinkedListClass<Integer> obj5 = new LinkedListClass<Integer>();
        LinkedListClass<Integer> obj6 = new LinkedListClass<Integer>();

        obj.add(178); //here i am adding first node
        obj2.add(12);
        obj3.addbeg(67);
        obj4.addbeg(3);
        obj5.addlast(12);
        obj6.add(3);

        System.out.println("now final LinkedList is");

        obj2.show();
        System.out.println("now final linked list after removing value 3 is: ");
        obj.removeUsingValue(3);
        obj.show();
        System.out.println("now final LinkedList after removing index 1 is");
        obj3.removeUsingIndex(1);
        obj4.show();
        System.out.println("searching value 12 in the linked list");
        obj3.search(12);
        System.out.println("current size of linkedlist is");
        obj5.size();

    }


}
