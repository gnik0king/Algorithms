/*
import java.util.PriorityQueue;
import java.util.Queue;
*/
public class App {
    public static void main(String[] args) throws Exception {
        /*
        Queue<String> pqueue = new PriorityQueue<>();
        pqueue.add("John");
        pqueue.add("Mathew");
        pqueue.add("Laura");

        for(String s : pqueue){
            System.out.println(s);
        }
        */

        // Create a stack
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(25);
        // Push a few items
        stack.push("house");
        stack.push("car");
        stack.push("building");

        // Try to iterate over the stack items using a for loop
        for (String s : stack){
            System.out.println(s);
        }
    }
}
