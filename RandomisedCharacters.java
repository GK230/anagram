import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class RandomisedCharacters {

    public String convertUnicodesToCharacters(List<Integer> randomUnicodes) {
//       converts randomised unicode array to characters
        String anagram = "";
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[randomUnicodes.size()];
        for (int i = 0; i < randomUnicodes.size(); i++) {
            arr[i] = randomUnicodes.get(i);
        }


        for (int i = 0; i < arr.length; i++) {
             String character = Character.toString(arr[i]);
             anagram += String.join("", character);
        }

        return anagram;
    }

}
