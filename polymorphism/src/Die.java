import java.util.Random;

public class Die {
    public static int nextRoll(){
        Random r = new Random();
        int low = 1;
        int high = 7;
        return r.nextInt(high-low) + low;
    }
}