
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        System.out.println("Input first word:");
        String word = scanner.nextLine().toLowerCase().trim();
        System.out.println("Input second word:");
        String word2 = scanner.nextLine().toLowerCase().trim();

        if (word.length() != word2.length()) {
            System.out.println("Not an anagram");
            return;
        }
        if (isAnagram(word, word2)) {
            System.out.println("Anagram!");
        } else {
            System.out.println("Not an anagram");
        }

    }

    private static boolean isAnagram(String word, String word2) {
        ArrayList<Character> array1 = new ArrayList<Character>();
        ArrayList<Character> array2 = new ArrayList<Character>();

        for (int i = 0; i < word.length(); i++) {
            array1.add(word.charAt(i));
        }
        for (int j = 0; j < word2.length(); j++) {
            array2.add(word2.charAt(j));
        }
        Collections.sort(array1);
        Collections.sort(array2);

        return array1.equals(array2);
    }
}