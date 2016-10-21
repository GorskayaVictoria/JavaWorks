package randomGame;

import java.util.Random;

/**
 * Created by sergey on 07.10.16.
 */
public class Player {
    private int number;
    public void getRandomNumber(){
        Random random=new Random();
        int a=random.nextInt(10);
        number= a;
    }

    public int getNumber() {
        return number;
    }
}
