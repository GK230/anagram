import java.util.*;

public class RandomUnicodes {

    public List<Integer> randomiseUnicodes(int[] unicodes){
        // randomises the unicodes

        List<Integer> Shuffled = new ArrayList<>();
        for (int i = 0; i < unicodes.length; i++){
            Shuffled.add(unicodes[i]);
        }
        Collections.shuffle(Shuffled);

        return Shuffled;
    }
}
