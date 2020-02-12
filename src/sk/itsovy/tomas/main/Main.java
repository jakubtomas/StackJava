package sk.itsovy.tomas.main;

import sk.itsovy.tomas.exception.StackOverFlowException;
import sk.itsovy.tomas.exception.StackUnderFlowException;
import sk.itsovy.tomas.stack.Stack;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class Main {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(4);

        try {
            stack.push(1);
            stack.push(2);
            stack.push(3); // add value into Stack

            stack.printStack();


            stack.pop();
            stack.printStack();

            System.out.println(stack.getSize());
            System.out.println(stack.getCapacity());
            stack.printStack();
        } catch (StackOverFlowException | StackUnderFlowException e) {
            e.printStackTrace();
        }
    }
}
