import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> value = new LinkedHashMap<String, Integer>();
        System.out.println("Write Your Desired Sentence : ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (value.containsKey(words[i])) {
                value.put(words[i], value.get(words[i]) + 1);
            } else {
                value.put(words[i], 1);
            }
        }
        for (Map.Entry<String, Integer> mp : value.entrySet()) {
            System.out.println("The Word --- " + mp.getKey() + " --- has a frequency of : " + mp.getValue());
        }
    }
}
