package adt;

public interface MyLinkedList<E>
{
  void add(E item);
  void addbeg(E item);
  void addlast(E item);
  void removeUsingValue(E item);
  void removeUsingIndex(int value);
 // void sort();
  void search(E item);
  void show();
  void size();
}
