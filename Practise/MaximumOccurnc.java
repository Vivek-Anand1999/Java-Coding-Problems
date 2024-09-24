import java.util.HashMap;
import java.util.Map;

public class MaximumOccurnc {
    public static void main(String[] args) {
        String name = "vivek";
        Map<Character,Integer> frequency = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            frequency.put(name.charAt(i), frequency.getOrDefault(name.charAt(i), 0)+1);
        }
        System.out.println(frequency);
    }
}
