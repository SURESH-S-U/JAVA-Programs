import java.util.*;
import java.io.*;


public class Hadoop1 {

    public static class TokenizerMapper {
        public List<Pair> map(String line) {
            List<Pair> mappedData = new ArrayList<>();
            StringTokenizer itr = new StringTokenizer(line);
            while (itr.hasMoreTokens()) {
                String word = itr.nextToken().toLowerCase();
                mappedData.add(new Pair(word, 1));
            }
            return mappedData;
        }
    }

    public static class IntSumReducer {
        public Map<String, Integer> reduce(List<Pair> mappedData) {
            Map<String, Integer> reducedResult = new HashMap<>();
            for (Pair pair : mappedData) {
                String key = pair.getKey();
                int value = pair.getValue();
                reducedResult.put(key, reducedResult.getOrDefault(key, 0) + value);
            }
            return reducedResult;
        }
    }

    public static class Pair {
        private String key;
        private int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== WORD COUNT SIMULATION (NO HADOOP REQUIRED) ===");
        System.out.println("Enter your text below:");
        String inputLine = sc.nextLine();
        sc.close();

        if (inputLine.trim().isEmpty()) {
            System.out.println("\nNo text provided. Total word count: 0");
            return;
        }

        TokenizerMapper mapper = new TokenizerMapper();
        List<Pair> mappedData = mapper.map(inputLine);

        IntSumReducer reducer = new IntSumReducer();
        Map<String, Integer> reducedData = reducer.reduce(mappedData);

        int totalWordCount = 0;
        for (int count : reducedData.values()) {
            totalWordCount += count;
        }sasdwdwdwd   
        System.out.println("Total number of words: " + totalWordCount);
    }
}
