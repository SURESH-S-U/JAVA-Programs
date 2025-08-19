public class Main {
    public static void main(String[] args) {
        String sentence = "Java is awesome";

        String[] words = sentence.split(" "); // split by space

        for (String word : words) {
            System.out.println(word);
        }
    }
}





public class Main {
    public static void main(String[] args) {
        String data = "one:two:three:four";

        String[] arr = data.split(":", 2); // split into 2 parts only

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
