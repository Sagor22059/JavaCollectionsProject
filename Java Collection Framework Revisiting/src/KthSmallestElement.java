import java.util.*;

public class KthSmallestElement {
    public static int findKthSmallest(List<Integer> list, int k) {
        Collections.sort(list);  // Sort the list
        return list.get(k - 1);  // kth smallest
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 10, 4, 3, 20, 15);
        int k = 3;
        System.out.println("The " + k + "rd smallest element is " + findKthSmallest(numbers, k));
    }
}
