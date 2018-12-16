import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    String storedWord;

    Anagram(String word) {
        storedWord = word;
    }

    List<String> match(List<String> words) {
        List<String> anagrams = new ArrayList<>();
        for (String word : words) {
            if (isAnagram(word)) {
                anagrams.add(word);
            }
        }

        return anagrams;
    }
    boolean isAnagram(String anotherWord) {
        String storedWorduppercase = storedWord.toUpperCase();
        String anotherWorduppercase = anotherWord.toUpperCase();
        if (storedWorduppercase.equals(anotherWorduppercase)){
            return false;
        }
        char[] storedChars = storedWord.toUpperCase().toCharArray();
        char[] anotherChars = anotherWord.toUpperCase().toCharArray();
        Arrays.sort(storedChars);
        Arrays.sort(anotherChars);
        return Arrays.equals(storedChars, anotherChars);

    }

}

