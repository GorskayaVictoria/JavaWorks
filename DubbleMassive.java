/**
 * Created by kiosk on 29.10.16.
 */
public class DubbleMassive {

    public static void main(String[] args){
        int m = 0;
        int [] numbers=new int[args.length];
        for (int i = 0; i <args.length ; i++) {
            numbers[i]= Integer.parseInt(args[i]);


            int k= numbers[i];
             int j;
            for (j = 1; j <args.length; j++) {

                if (k ==  numbers[i]) {
                m++;
            }
                    i++;
        }}
            System.out.println(m);
    }}