package work1;


/**
 * Created by sergey on 07.10.16.
 */
public class Work1 {
    public static void main(String[] args) {
        Cow red=new Red(0,0);
        System.out.println(red.weight);
        System.out.println(red.muu());
        red.eat(new Food(4));
        red.move(15,23);
    }
}
