

/* convert a camel case string into a snake case string.                                 
Input: thisIsCamelCase  Output: this_is_camel_case */




public class Sample {
    public static void main(String[] args) {
        String str = "i Am Suresh S U";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result.append("_").append(Character.toLowerCase(ch));
            } else if (ch != ' ') { // Skip spaces
                result.append(ch);
            }
        }

        System.out.print(result.toString());
    }
}
