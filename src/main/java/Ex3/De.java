package Ex3;

import java.util.Random;

public class De implements Ide {

    @Override
    public int getRoll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

}
