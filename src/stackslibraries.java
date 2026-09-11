
import sidlibs.stacks;

import java.util.Stack;

public class stackslibraries {
    public static void main(String[] args) {


        stacks books = new dynamicstacks(5);
//        Stack<Integer> stger = new Stack<>();
//
//        stacks stcker = new stacks(4);
//
//        stcker.push(4);
//        stcker.push(8);
//        stcker.push(8);
//        stcker.push(9);
//        stcker.push(7);
//
//        stger.push(2);
//        stger.push(5);
//        stger.push(7);
//        stger.push(9);
//        stger.push(2);
//        stger.push(10);
//
//        System.out.println(stger.peek());
//        System.out.println(stger.pop());
//        System.out.println(stger.peek());
//
//        System.out.println(stcker.pop());


        books.push(5);
        books.push(8);
        books.push(3);
        books.push(8);
        books.push(2);
        books.push(9);
        books.push(4);
        
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.peek());




    }
}
