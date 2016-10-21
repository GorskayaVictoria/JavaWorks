package jump;

/**
 * Created by sergey on 14.10.16.
 */
public class Player {
    private int x;
    public Player(int x){
        this.x=x;
    }
    public void jump(int jumpLength){
        x=x+jumpLength;
    }
    public int getX(){
        return x;

    }
}
