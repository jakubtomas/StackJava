package sk.itsovy.tomas.Queue;

import sk.itsovy.tomas.exception.StackOverFlowException;
import sk.itsovy.tomas.exception.StackUnderFlowException;

import java.util.ArrayList;

public class Queue<T> {


    private int size = 0;
    private int capacity;
    //private T[] array;
    private ArrayList<T> list;


    public Queue(int capacity) { // constructor

        // condition capacity can not be less than 1

        if (capacity < 1) {
            this.capacity = 10;
        } else {
            this.capacity = capacity;
        }
        list = new ArrayList<>();

    }

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


    // enqueue add element
    //dequeue  delete element

    // add value to Array list

    public void enqueue(T object) throws StackOverFlowException {
        if (object == null) return;
        if (!isFull()) {
            list.add(object);
            size++; //
        } else throw new StackOverFlowException("Stack is full  okey !");
    }


    // delete value from 0 position first

    public void dequeue() throws StackUnderFlowException {
        if (isEmpty()) throw new StackUnderFlowException("Stack is empty  prazdne !");
        else {
            size--;
            list.remove(0);
        }
    }

// return value from 0 position is like TOP in stack but 0 position

    public T front() {

        if (isEmpty()) return null; // interesting
        else {
            return list.get(0);
        }
    }

    public T FrontAndDequeue() throws StackUnderFlowException {
        T temp = front();
        dequeue();
        return temp;
    }


    public void empty() {
        list.clear();
    }


}
