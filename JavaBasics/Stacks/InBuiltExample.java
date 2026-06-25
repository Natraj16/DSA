package JavaBasics.Stacks;

import java.util.*;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(35);
        stack.push(39);
        stack.push(34);
        stack.push(45);
        stack.push(9);

        //popping from empty stack returns EmptyStackException
        //pop returns an integer
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> q =new LinkedList<>();
//        System.out.println(q.element());
        System.out.println(q.peek());
        queue.add(3);
        queue.add(6);
        queue.add(9);
        queue.add(12);
        queue.add(15);

        System.out.println(queue.peek());//peek gets the item but doesnt remove it from the queue
        System.out.println(queue.remove());//but remove will remove the element present at the first of the queue(head of the queue)
        System.out.println(queue.peek());
        int a =queue.element();
        System.out.println("the head of the queue with .element: "+a);
        //the .element() and .peek() are somewhat similar as both returns the head of the queue without deleting it but when the queue is empty the peek returns null and element returns NoSuchElementException()
        Deque<Integer> deque = new ArrayDeque<>();
        //ArrayDeque<>() class provides us to create an object(has a resizable array, has no capacity restriction)
        deque.add(89);
        deque.add(96);

        deque.addLast(56);

        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
    }
}
