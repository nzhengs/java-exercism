import java.util.ArrayList;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        ArrayList<Character> existingcharacters = new ArrayList<>();
        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            boolean hyphen = c == '-';
            boolean space = c == ' ';
            if (hyphen | space) {
                continue;
            }
            char lowercase = Character.toLowerCase(c);
            boolean contains = existingcharacters.contains(lowercase);
            if (contains) {
                return false;
            } else {
                existingcharacters.add(lowercase);
            }
        }
        return true;
    }

}
