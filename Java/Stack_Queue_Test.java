import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Stack_Queue_Test {

    public static void main(String[] args) {
        Queue<Object> q = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            q.add(i); // Adds elements
        q.add("Geeks");
        q.remove(); // To remove the head of queue.
        q.remove("5");
        System.out.println("head of queue-" + q.peek());
        System.out.println("Size of queue-" + q.size());
        System.out.println("Top Element-" + q.poll());

        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the" + " stack is: " + stack.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);
        // Removing elements using pop() method
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Does the stack contains '1'? " + stack.search(1));
    }

}
