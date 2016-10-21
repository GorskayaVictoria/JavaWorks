package randomGame;

import java.util.Scanner;

/**
 * Created by sergey on 07.10.16.
 */
public class Game {
    Player p1;
    Player p2;
    Player p3;
    public void start(){
        while (true) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);

            int targetNumber = scanner.nextInt();

            p1 = new Player();
            p2 = new Player();
            p3 = new Player();

            p1.getRandomNumber();
            p2.getRandomNumber();
            p3.getRandomNumber();

            if (p1.getNumber() == targetNumber) {
                System.out.println("Win PLayer1" + "target=" + targetNumber + "number=" + p1.getNumber());
            }

            if (p2.getNumber() == targetNumber) {
                System.out.println("Win PLayer2" + "target=" + targetNumber + "number=" + p2.getNumber());
            }

            if (p3.getNumber() == targetNumber) {
                System.out.println("Win PLayer3" + "target=" + targetNumber + "number=" + p3.getNumber());
            }
            if (p1.getNumber() != targetNumber && p3.getNumber() != targetNumber && p2.getNumber() != targetNumber) {
                System.out.println("Никто не угадал" + p1.getNumber() + "" + p2.getNumber() + "" + p3.getNumber());
            }
        }
    };
}
