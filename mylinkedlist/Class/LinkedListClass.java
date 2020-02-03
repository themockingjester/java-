package Class;
import java.util.*;
import java.lang.*;
import adt.MyLinkedList;

public class LinkedListClass<E> implements MyLinkedList<E> {
    private static int size = 0;
    private static Object a;
    private LinkedListClass<E> head = null;
    //private LinkedListClass<E> tail = null;
    private E data;
    private LinkedListClass<E> next = null;

    public LinkedListClass<E> getNext() {
        return next;
    }

    @Override
    public void add(E item) {
        if (size == 0) {
            this.data = item;
            // tail = this;

            size++;
            this.next = null;
            head = this;
            a = (Object) head;
        } else {
            this.data = item;
            size++;
            this.next = null;
            head = (LinkedListClass<E>) a;                  //downcasting
            while (head.getNext() != null)
                head = head.getNext();
            head.next = this;
        }


    }

    @Override
    public void addbeg(E item) {
        if (size != 0) {
            head = (LinkedListClass<E>) a;
            this.data = item;
            this.next = head;
            head = this;
            a = (Object) head;
        } else {
            System.out.println("can't use this method because linkedlist is empty");
        }


    }

    @Override
    public void addlast(E item) {
        if (size != 0) {
            head = (LinkedListClass<E>) a;                  //downcasting
            while (head.getNext() != null)
                head = head.getNext();


            this.data = item;
            this.next = null;
            head.next = this;
        } else {
            System.out.println("can't use this method because linkedlist is empty!!");
        }

    }
    @Override
    public  void removeUsingIndex(int value)
    {
        head = (LinkedListClass<E>) a;
        int ctr = 0;
        LinkedListClass<E> temp = null;
        while (ctr!=value)
        {
            if(value-ctr==1)
            {
                temp=head;
            }
            head=head.next;
            ctr++;

        }
        if(ctr==value)
        {

            temp.next=head.next;
            head=null;
        }
    }

    @Override
    public void size()
    {
        head=(LinkedListClass<E>) a;
        int ctr=1;
        while(head.next!=null)
            {
                ctr++;
                head=head.next;
            }
        System.out.println("Size: "+ctr);

    }
    @Override
    public void search(E item)
    {
        head = (LinkedListClass<E>) a;
        int ctr=0;
        while (head.data!=item && head.next!=null)
        {
            ctr++;

            head=head.next;

        }
        if(head.data==item)
            System.out.println("value is "+ head.data+" index "+ctr);
        if(head.next==null){
            System.out.println("not present in the list");
        }


    }
    @Override
    public void removeUsingValue(E item) {
        head = (LinkedListClass<E>) a;
        int ctr = 0;
        while (head.next != null) {
            if (head.data == item && ctr == 0) {
                LinkedListClass<E> temp = null;
                temp = head.next;
                head.next = null;
                head = temp;
                a = (Object) head;
                ctr = 0;
            } else {
                if ((head.next).data == item)
                    head.next = (head.next).next;
                else
                    head = head.next;
                ctr++;
            }

        }
    }

    @Override
    public void show() {
        head = (LinkedListClass<E>) a;

        while (head.next != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println(head.data);


    }
}
