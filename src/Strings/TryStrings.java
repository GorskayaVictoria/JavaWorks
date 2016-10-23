package Strings;

import java.util.Scanner;

/**
 * Created by sergey on 23.10.16.
 */
public class TryStrings {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String cartLine=scanner.nextLine();
        String [] array=cartLine.split(" ");
        Cart cart = new Cart(array[0],array[1],array[2], array[3]);
        System.out.println(cart.toString());

    }
}
