package sk.itsovy.tomas.stack;

import org.w3c.dom.ls.LSOutput;
import sk.itsovy.tomas.exception.StackOverFlowException;
import sk.itsovy.tomas.exception.StackUnderFlowException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import  java.util.List;
public class Stack<T> {

    private int size = 0;
    private int capacity;
    //private T[] array;
    private ArrayList <T> list;


    public Stack(int capacity){
        this.capacity = capacity;
        list = new ArrayList<>();

    }


    /* Zasobnik  knih  kde ukladas na seba knihy a vyberas poslednu
    pridanu knihu do zasobnika
    *
    * osetrit  keby som vytvoril array list s minusovim cislom
    *
    * */

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void push(T object) throws StackOverFlowException {
        if (object == null) return;
        if (!isFull()) {
            list.add(object);
            size++;
        }
        else throw new StackOverFlowException("Stack is full  okey !");
    }

    public void pop() throws StackUnderFlowException { // remove last value what we add
        if (isEmpty()) throw new StackUnderFlowException("Stack is empty  prazdne !");
        else {
            size--;
            list.remove(size -1);
        }
    }

    public T top() { // posledna pridana hodnota
        if (isEmpty()) return null; // intresting
        else {
            return list.get(size-1);
        }
    }

    public T topAndPop() throws StackUnderFlowException {
        T temp = top();
        pop();
        return temp;
    }

    public void empty() {
        list.clear();
    }

    public void printStack() {
        System.out.print("(");
        for (T t:list) {
            System.out.print(" " + t + ",");

        }
        System.out.print(" ) ");

    }





}
