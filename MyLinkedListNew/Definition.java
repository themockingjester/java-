package main;
import java.util.*;
import java.lang.*;

import static java.lang.Character.getName;

public class Definition<E> {
    private Node<E> head=null;
    private int size=0;
    private E data;

    public void  addFirst(E item)
    {

        head=new Node<>(item,head);
        size++;

    }
    public void addLast(E item)
    {
        Node<E> temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node<E>(item);
        size++;
    }
    private Node<E> getNodeBeforeCurrent(Node<E> temp)
    {
        Node<E> temp2=head;

        while (temp2.next!=temp)
        {
            temp2=temp2.next;
        }
        return temp2;
    }
    public void show()
    {
        Node<E> temp = head;
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    public void search(E item)
    {
        Node<E> temp = head;
        int ctr=0;
        while(temp.data!=item)
        {
            temp=temp.next;
            ctr++;
        }
        System.out.println("Value was: "+item+" and it is at index : "+ctr);

    }
    public void removeFirst()
    {
        head=head.next;
        size--;
    }
    public  void  removeLast()
    {
        Node<E> temp = head;
        while((temp.next).next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void removeUsingValue(E item)
    {
        if(head!=null)
        {
            Node<E> temp = head;
            while (temp.next!=null)
            {
                if(temp.equals(head) && temp.data==item)
                {
                    removeFirst();
                    temp=temp.next;
                    size--;
                    //continue;
                }
                else if (temp.data==item)
                {
                    getNodeBeforeCurrent(temp).next=temp.next;
                    //System.out.println("va;ue before it is "+temp.data);
                    size--;
                    temp=temp.next;

                }
                else
                {
                    temp=temp.next;
                }

            }
            if (temp.data==item)
            {
                removeLast();
                size--;
            }
        }
    }
    public void size()
    {
        System.out.println("size is "+size);
    }
    public void  sort()
    {
        if(size>1)

        {

            for(int i =0;i<size;i++)
        {
            Node<E> temp = head;
            for(int j= 0 ; j<size;j++)
            {
                if(temp.next!=null)
                {
                    if(             (int)temp.data > (int)(temp.next).data            )
                    {
                                E value = temp.data;
                                temp.data=temp.next.data;
                                temp.next.data=value;
                    }
                    temp=temp.next;
                }
            }
        }
        }
    }
    public  void addAfter(E afterthis,E item)
    {
        Node<E> temp = head;
        while(temp.next!=null)
        {
            if(temp.data==afterthis)
            {
                temp.next=new Node<>(item,temp.next);
                size++;
                temp=temp.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        //this is for adding the new node at the end when afterthis is available at last index
        if(temp.data==afterthis)
        {
            temp.next=new Node<>(item,temp.next);
            size++;
            temp=temp.next;
        }
    }
    public void insertAt(int index,E item)
    {
        Node<E> temp = head;
        int ctr=0;
        if(index!=0)

        {
         while(index-ctr!=1)
            {
                temp=temp.next;
                ctr++;
            }
            temp.next=new Node<>(item,temp.next);
            size++;
        }
        else
        {
            addFirst(item);
        }

    }
    private  static  class Node<E>
    {
        private Node<E> next;
        private E data;
        public Node(E item)
        {
            this.data=item;
            this.next=null;
        }
        public Node(E item,Node<E> next)
        {
            this.next=next;
            this.data=item;
        }
        public Node<E> getNode()
        {
            return this.next;
        }
        public E getData()
        {
            return this.data;
        }

    }

}
