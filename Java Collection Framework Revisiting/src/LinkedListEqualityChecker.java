import java.util.*;

public class LinkedListEqualityChecker {
    public static boolean areEqual(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        return l1.equals(l2);  // Checks both content and order
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list3 = new LinkedList<>(Arrays.asList(3, 2, 1));

        System.out.println("List1 equals List2? " + areEqual(list1, list2));
        System.out.println("List1 equals List3? " + areEqual(list1, list3));
    }
}
