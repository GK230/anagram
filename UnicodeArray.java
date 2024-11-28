public class UnicodeArray {

    // converts string to code points and store in an array
    public int[] convertStringToUnicodes(String formattedString, int length) {
        int[] unicodes = new int[length];
        for (int i = 0; i < formattedString.length(); i++) {
                int codepoint = formattedString.codePointAt(i);
                unicodes[i] = codepoint;
            }
        return unicodes;
    }
}

