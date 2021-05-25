import java.util.Arrays;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String args[])
    {

        // Creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Use add() method to add elements in the list
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");


        // Output the list
       System.out.println("LinkedList:" + list);

        // Remove the head using remove()
        list.removeFirstOccurrence("A");
        Object[] a = list.toArray();
        // Print the final list
        System.out.println("Final LinkedList:" + Arrays.toString(a));
    }
}