import java.util.*;

public class WordFrequencyTreeMap {
    public static void main(String[] args) {
        String text = "hello world hello java world java java";
        String[] words = text.split(" ");

        TreeMap<String, Integer> frequencyMap = new TreeMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
