package massive;

/**
 * Created by sergey on 21.10.16.
 */
public class Main {
    public static void main(String[] args) {
        int [] numbers=new int[args.length];
        for (int i = 0; i <args.length ; i++) {
            numbers[i]= Integer.parseInt(args[i]);
        }

        int [] buff=new int[numbers.length];
        for (int i = 0; i <numbers.length ; i++) {


            buff[numbers.length-i-1] = numbers[i];
        }
        for (int i = 1; i <numbers.length ; i+=2) {
            int buffer=numbers[i-1];
            numbers[i-1]=numbers[i];
            numbers[i]=buffer;
        }
        print(numbers);


        for (int i = 0; i < buff.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <buff.length ; i++) {
            System.out.print(buff[i]+" ");
        }
    }
    public static void print(int [] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");

        }
        System.out.println();
    }
}
