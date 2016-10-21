package jump;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by sergey on 14.10.16.
 */
public class Game {
    private Random random=new Random();
    public void start(){
        System.out.println("Введите число");
        Scanner scanner= new Scanner(System.in);

        int jumpLength=scanner.nextInt();

        Platform mainPlatform=generatePlatform(0);

        int xPlayer= mainPlatform.getX2()-random.nextInt((mainPlatform.getX2()-mainPlatform.getX1())+1);
        Player player=new Player(xPlayer);

        Platform secondPlatform=generatePlatform(mainPlatform.getX2());


        player.jump(jumpLength);

        int x2=secondPlatform.getX2();
        while (true) {
            if (player.getX() >= secondPlatform.getX1() && player.getX() <= secondPlatform.getX2()) {
                secondPlatform = generatePlatform(x2);
                System.out.println("Вы допрыгнули! Введите новое число player="+player.getX()+" ");
                jumpLength = scanner.nextInt();
                player.jump(jumpLength);
                x2=secondPlatform.getX2();
            } else {
                System.out.println("Проиграл "+ "Player x="+player.getX()+" platform x1,x2="+secondPlatform.getX1()+" "+secondPlatform.getX2());
                System.exit(0);
            }
        }

    }

    private Platform generatePlatform(int x2){
        int x1SecondPlatform = x2+ (random.nextInt(3)+1);
        int x2SecondPlatform= x1SecondPlatform+random.nextInt(4)+1;
        Platform secondPlatform=new Platform(x1SecondPlatform, x2SecondPlatform);
        return secondPlatform;


    }
}
