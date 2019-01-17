import java.util.HashMap;

public class charCounter {

    public static String returnCount(String str) {
        // remove spaces
        str = str.replaceAll(" ", "");
        // remove all non-alphanumeric
        str = str.replaceAll("[^a-zA-Z\\d\\s]", "");

        HashMap<Character, Integer> dict = new HashMap<>();

        for (char s: str.toCharArray()) {
            if (dict.containsKey(s) == false) {
                dict.put(s, 1);
            } else {
                dict.put(s, dict.get(s) + 1);
            }
        }

        // prepare string to be returned
        String returnString = "";
        for (char s: dict.keySet()) {
            returnString = returnString + "char(" + s + "): " + dict.get(s) + " | ";
        }
        return returnString;
    }
}
