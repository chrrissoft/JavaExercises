import java.util.ArrayList;
import java.util.Hashtable;

public class Exercise13 {

    final static Hashtable<String, Integer> alphabetIndex = new Hashtable<>();

    public static void main(String[] args) {
        System.out.println(run());
    }

    private static ArrayList<Character> run() {
        initHash();
        final String input = "ghbjirychopgzhids";
        final char[] output = new char[alphabetIndex.size()];
        final ArrayList<Character> finalOutput = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            final String key = Character.toString(input.charAt(i));
            final int value = alphabetIndex.get(key);
            output[value] = key.charAt(0);
        }
        for (char value : output) {
            final String key = Character.toString(value);
            if (input.contains(key)) {
                finalOutput.add(value);
            }
        }
        return finalOutput;
    }

    private static void initHash() {
        alphabetIndex.put("a", 0);        alphabetIndex.put("b", 1);        alphabetIndex.put("c", 2);        alphabetIndex.put("d", 3);
        alphabetIndex.put("e", 4);        alphabetIndex.put("f", 5);        alphabetIndex.put("g", 6);        alphabetIndex.put("h", 7);
        alphabetIndex.put("i", 8);        alphabetIndex.put("j", 9);        alphabetIndex.put("k", 10);        alphabetIndex.put("l", 11);
        alphabetIndex.put("m", 12);        alphabetIndex.put("n", 13);        alphabetIndex.put("o", 14);        alphabetIndex.put("p", 15);
        alphabetIndex.put("q", 16);        alphabetIndex.put("r", 17);        alphabetIndex.put("s", 18);        alphabetIndex.put("t", 19);
        alphabetIndex.put("u", 20);        alphabetIndex.put("v", 21);        alphabetIndex.put("w", 22);        alphabetIndex.put("x", 23);
        alphabetIndex.put("y", 24);        alphabetIndex.put("z", 25);

    }

}
