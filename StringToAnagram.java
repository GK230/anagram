import java.util.ArrayList;
import java.util.List;

public class StringToAnagram {
    String stringWithSpace = "";
    int stringWithSpaceLength;

    private void setInputWord (String toAnagram) {
//      Add space to string
        stringWithSpace = toAnagram + " ";
    }

    private int getStringWithSpaceLength() {
        stringWithSpaceLength = stringWithSpace.length();
        return stringWithSpaceLength;
    }

    public static void main(String[] args) {
        String toAnagram = "documenting";
        StringToAnagram stringToAnagram = new StringToAnagram();
        UnicodeArray unicodeArray = new UnicodeArray();
        RandomUnicodes randomunicodes = new RandomUnicodes();
        RandomisedCharacters randomisedCharacters = new RandomisedCharacters();
        stringToAnagram.setInputWord(toAnagram);
        int stringWithSpaceLength = stringToAnagram.getStringWithSpaceLength();
        int[] unicodes = unicodeArray.convertStringToUnicodes(stringToAnagram.stringWithSpace, stringWithSpaceLength);
        List randomisedUnicodes = randomunicodes.randomiseUnicodes(unicodes);
        String anagram = randomisedCharacters.convertUnicodesToCharacters(randomisedUnicodes);
        System.out.print("the anagram" + " " + anagram);

    }
}

















