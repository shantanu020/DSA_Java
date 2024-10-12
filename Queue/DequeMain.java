package Queue;

import java.util.*;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        
        // Simulation of Stack LIFO
        System.out.println("STACK");
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        System.out.println(deque);
        System.out.println("Removed From Top: "+deque.removeLast());
        System.out.println(deque);
        
        // Simulation of Queue FIFO
        System.out.println("\nQUEUE");
        deque.addLast(4);
        System.out.println(deque);
        System.out.println("Removed Form Begining: "+deque.removeFirst());
        System.out.println(deque);

    }
}
